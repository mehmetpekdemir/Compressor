package com.mehmetpekdemir.compressor;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public interface Compressor {

	byte[] compress(final byte[] data);

	byte[] decompress(final byte[] compressedData);
}
