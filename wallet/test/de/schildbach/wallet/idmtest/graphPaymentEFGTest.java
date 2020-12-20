

package de.schildbach.wallet.idmtest;

import com.google.common.io.CharStreams;
import org.bitcoinj.wallet.WalletProtobufSerializer;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import de.schildbach.wallet.util.Crypto;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class graphPaymentEFGTest {
    private static final String PLAIN_TEXT = "plain text";
    private static final byte[] PLAIN_BYTES = PLAIN_TEXT.getBytes();
    private static final char[] PASSWORD = "password".toCharArray();

    @Test
    public void graphPaymentEFGTest1() throws Exception {
        final String plainText = Crypto.decrypt(Crypto.encrypt(PLAIN_TEXT, PASSWORD), PASSWORD);
        assertEquals(PLAIN_TEXT, plainText);
    }
}
