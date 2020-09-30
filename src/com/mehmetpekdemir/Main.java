package com.mehmetpekdemir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import com.mehmetpekdemir.compressor.Compressor;
import com.mehmetpekdemir.compressor.SimpleCompressor;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Compressor compressor = new SimpleCompressor();

		byte[] original = Files.readAllBytes(Paths.get("temp.txt"));

		byte[] compressed = compressor.compress(original);

		System.out.println("Original Size : " + original.length);
		System.out.println("Compressed Size : " + compressed.length);

		byte[] decompressed = compressor.decompress(compressed);

		System.out.println(Arrays.equals(original, decompressed));

	}

}
