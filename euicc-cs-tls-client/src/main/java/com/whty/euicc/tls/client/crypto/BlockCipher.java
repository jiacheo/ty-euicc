package com.whty.euicc.tls.client.crypto;

import com.whty.euicc.tls.client.crypto.CipherParameters;
import com.whty.euicc.tls.client.crypto.DataLengthException;

public abstract interface BlockCipher
{
  public abstract void init(boolean paramBoolean, CipherParameters paramCipherParameters)
    throws IllegalArgumentException;
  
  public abstract String getAlgorithmName();
  
  public abstract int getBlockSize();
  
  public abstract int processBlock(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2)
    throws DataLengthException, IllegalStateException;
  
  public abstract void reset();
}

