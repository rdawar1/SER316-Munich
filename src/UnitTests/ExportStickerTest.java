package UnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.memoranda.ui.ExportSticker;

public class ExportStickerTest {

	//Creates a txt file and html file both named Test to demonstrate the ability to export, then attempts to create 2 files
	//without names, which fails.
	@Test
	public void test() {
		assertTrue(new ExportSticker("Test").export("txt"));
		assertTrue(new ExportSticker("Test").export("html"));
		assertFalse(new ExportSticker("").export("html"));
		assertFalse(new ExportSticker(null).export("html"));
	}

}
