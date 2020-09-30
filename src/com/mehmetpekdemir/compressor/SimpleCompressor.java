package com.mehmetpekdemir.compressor;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterOutputStream;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public class SimpleCompressor implements Compressor {

	@Override
	public byte[] compress(final byte[] data) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		DeflaterOutputStream deflater = new DeflaterOutputStream(out);
		try {
			deflater.write(data);
			deflater.finish();
			return out.toByteArray();
		} catch (IOException ioException) {
			System.out.println("Error : " + ioException);
		}

		return new byte[0];
	}

	@Override
	public byte[] decompress(final byte[] compressedData) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		InflaterOutputStream inflater = new InflaterOutputStream(out);
		try {
			inflater.write(compressedData);
			inflater.finish();
			return out.toByteArray();
		} catch (IOException ioException) {
			System.out.println("Error : " + ioException);
		}

		return new byte[0];
	}

}
