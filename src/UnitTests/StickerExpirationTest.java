
//dlahtine
package UnitTests;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;

import javax.swing.JDialog;

import net.sf.memoranda.EventsManager;
import net.sf.memoranda.date.*;
import net.sf.memoranda.ui.*;
import net.sf.memoranda.util.CurrentStorage;
import net.sf.memoranda.util.FileStorage;

import nu.xom.Element;

import org.junit.Test;

public class StickerExpirationTest {

	@Test
	//This will require 
	public void testStickerExpiration() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date expirationDate = new Date();
		//The 12 is for font size.
		String orig = "This sticker should not exist; it is a monument to man's arrogance.";
		int sP = 0;
		String txt = ("<div style=\"background-color:"+
			   "0"+";font-size:"+
			   "12"+";color:"+ 
			   "FFFFFF"+"; \">" + orig+ 
			   "</div>");
		EventsManager.createSticker(txt, sP, expirationDate);
		//FileStorage.JN_DOCPATH = FileStorage.JN_DOCPATH + "/ExpirationStickerTest";
		CurrentStorage.get().storeEventsManager();
		
		Map stickers = EventsManager.getStickers();
		String raw_sticker;
		String stickerText;
		int first;
		int last;
		Iterator i = stickers.entrySet().iterator();
		while (i.hasNext()){
			Entry stickerEntry = (Entry) i.next();
			raw_sticker = (String) ((Element)stickerEntry.getValue()).getValue();
			stickerText = getOriginalStickerText(raw_sticker);
	
			System.out.println(stickerText);
			//Should never load a sticker with the same text as the original
			assertFalse(stickerText.compareTo(orig) == 0);
		}
	}
	
	@Test
	public void testStickerPermanance() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//Date expirationDate = new Date();
		//The 12 is for font size.
		String orig = "This sticker will live forever.";
		int sP = 0;
		String txt = ("<div style=\"background-color:"+
			   "0"+";font-size:"+
			   "12"+";color:"+ 
			   "FFFFFF"+"; \">" + orig+ 
			   "</div>");
		EventsManager.createSticker(txt, sP, null);
		//FileStorage.JN_DOCPATH = FileStorage.JN_DOCPATH + "/ExpirationStickerTest";
		CurrentStorage.get().storeEventsManager();
		
		Map stickers = EventsManager.getStickers();
		String raw_sticker;
		String stickerText;
		int first;
		int last;
		Iterator i = stickers.entrySet().iterator();
		boolean success = false;
		while (i.hasNext()){
			Entry stickerEntry = (Entry) i.next();
			raw_sticker = (String)((Element)stickerEntry.getValue()).getValue();
			stickerText = getOriginalStickerText(raw_sticker);
	
			System.out.println(stickerText);
			//Should never load a sticker with the same text as the original
			if (stickerText.compareTo(orig) == 0) {
				success = true;
				break;
			}
		}
		assertTrue(success);
	}
	
	@Test
	public void testStickerNotDeadYet() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date expirationDate = sdf.parse("31/03/2018");
		//The 12 is for font size.
		String orig = "Memento Mori";
		int sP = 0;
		String txt = ("<div style=\"background-color:"+
			   "0"+";font-size:"+
			   "12"+";color:"+ 
			   "FFFFFF"+"; \">" + orig+ 
			   "</div>");
		EventsManager.createSticker(txt, sP, expirationDate);
		//FileStorage.JN_DOCPATH = FileStorage.JN_DOCPATH + "/ExpirationStickerTest";
		CurrentStorage.get().storeEventsManager();
		
		Map stickers = EventsManager.getStickers();
		String raw_sticker;
		String stickerText;
		int first;
		int last;
		Iterator i = stickers.entrySet().iterator();
		boolean success = false;
		while (i.hasNext()){
			Entry stickerEntry = (Entry) i.next();
			raw_sticker = (String) ((Element)stickerEntry.getValue()).getValue();
			stickerText = getOriginalStickerText(raw_sticker);
	
			System.out.println(stickerText);
			//Should never load a sticker with the same text as the original
			if (stickerText.compareTo(orig) == 0)  {
				success = true;
				break;
			}
		}
		assertTrue(success);
	}

	private String getOriginalStickerText(String pre_sticker){
		//THIS DOES NOT WORK FOR MULTILINE STICKERS!
		int first=pre_sticker.indexOf(">");
		int last=pre_sticker.lastIndexOf("<");
		
		pre_sticker = pre_sticker.substring(first+1, last);
		return pre_sticker;
	}
}
