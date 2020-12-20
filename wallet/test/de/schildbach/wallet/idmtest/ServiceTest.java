

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


public class ServiceTest {
    private static final String PLAIN_TEXT = "plain text";
    private static final byte[] PLAIN_BYTES = PLAIN_TEXT.getBytes();
    private static final char[] PASSWORD = "password".toCharArray();

    @Test
    public void cyptoTest1() throws Exception {
        final String plainText = Crypto.decrypt(Crypto.encrypt(PLAIN_TEXT, PASSWORD), PASSWORD);
        assertEquals(PLAIN_TEXT, plainText);
    }

    @Test
    public void cyptoTest2() throws Exception {
        final StringBuilder builder = new StringBuilder();
        while (builder.length() < 4096) {
            final String plainText = builder.toString();
            final String roundtrippedPlainText = Crypto.decrypt(Crypto.encrypt(plainText, PASSWORD), PASSWORD);
            assertEquals(plainText, roundtrippedPlainText);

            builder.append('x');
        }
    }

    @Test
    public void cyptoTest3() throws Exception {
        final byte[] plainBytes = Crypto.decryptBytes(Crypto.encrypt(PLAIN_BYTES, PASSWORD), PASSWORD);
        assertArrayEquals(PLAIN_BYTES, plainBytes);
    }

    @Test
    public void cyptoTest4() throws Exception {
        final ByteArrayOutputStream stream = new ByteArrayOutputStream(4096);
        while (stream.toByteArray().length < 4096) {
            final byte[] plainBytes = stream.toByteArray();
            final byte[] roundtrippedPlainBytes = Crypto.decryptBytes(Crypto.encrypt(plainBytes, PASSWORD), PASSWORD);
            assertArrayEquals(plainBytes, roundtrippedPlainBytes);

            stream.write(42);
        }
    }

    @Test
    public void mainTest1() throws Exception {
        final StringBuilder builder = new StringBuilder();
        while (builder.length() < 4096) {
            final char[] password = builder.toString().toCharArray();
            final String plainText = Crypto.decrypt(Crypto.encrypt(PLAIN_TEXT, password), password);
            assertEquals(PLAIN_TEXT, plainText);

            builder.append('x');
        }
    }

    @Test
    public void mainTest2() throws Exception {
        final byte[] backup = Crypto.decryptBytes(readBackupFromResource("bitcoin-wallet-backup-testnet-3.50"),
                PASSWORD);
        assertTrue(WalletProtobufSerializer.isWallet(new ByteArrayInputStream(backup)));

        final byte[] backupCrLf = Crypto.decryptBytes(readBackupFromResource("bitcoin-wallet-backup-testnet-3.50-crlf"),
                PASSWORD);
        assertTrue(WalletProtobufSerializer.isWallet(new ByteArrayInputStream(backupCrLf)));
    }

    @Test
    public void mainTest3() throws Exception {
        final ByteArrayOutputStream stream = new ByteArrayOutputStream(4096);
        while (stream.toByteArray().length < 4096) {
            final byte[] plainBytes = stream.toByteArray();
            final byte[] roundtrippedPlainBytes = Crypto.decryptBytes(Crypto.encrypt(plainBytes, PASSWORD), PASSWORD);
            assertArrayEquals(plainBytes, roundtrippedPlainBytes);

            stream.write(42);
        }
    }

    @Test
    public void mainTest4() throws Exception {
        final ByteArrayOutputStream stream = new ByteArrayOutputStream(4096);
        while (stream.toByteArray().length < 4096) {
            final byte[] plainBytes = stream.toByteArray();
            final byte[] roundtrippedPlainBytes = Crypto.decryptBytes(Crypto.encrypt(plainBytes, PASSWORD), PASSWORD);
            assertArrayEquals(plainBytes, roundtrippedPlainBytes);

            stream.write(42);
        }
    }

    @Test
    public void offlineTest1() throws Exception {
        final ByteArrayOutputStream stream = new ByteArrayOutputStream(4096);
        while (stream.toByteArray().length < 4096) {
            final byte[] plainBytes = stream.toByteArray();
            final byte[] roundtrippedPlainBytes = Crypto.decryptBytes(Crypto.encrypt(plainBytes, PASSWORD), PASSWORD);
            assertArrayEquals(plainBytes, roundtrippedPlainBytes);

            stream.write(42);
        }
    }

    @Test
    public void offlineTest2() throws Exception {
        final ByteArrayOutputStream stream = new ByteArrayOutputStream(4096);
        while (stream.toByteArray().length < 4096) {
            final byte[] plainBytes = stream.toByteArray();
            final byte[] roundtrippedPlainBytes = Crypto.decryptBytes(Crypto.encrypt(plainBytes, PASSWORD), PASSWORD);
            assertArrayEquals(plainBytes, roundtrippedPlainBytes);

            stream.write(42);
        }
    }

    @Test
    public void offlineTest3() throws Exception {
        final ByteArrayOutputStream stream = new ByteArrayOutputStream(4096);
        while (stream.toByteArray().length < 4096) {
            final byte[] plainBytes = stream.toByteArray();
            final byte[] roundtrippedPlainBytes = Crypto.decryptBytes(Crypto.encrypt(plainBytes, PASSWORD), PASSWORD);
            assertArrayEquals(plainBytes, roundtrippedPlainBytes);

            stream.write(42);
        }
    }

    @Test
    public void offlineTest4() throws Exception {
        final ByteArrayOutputStream stream = new ByteArrayOutputStream(4096);
        while (stream.toByteArray().length < 4096) {
            final byte[] plainBytes = stream.toByteArray();
            final byte[] roundtrippedPlainBytes = Crypto.decryptBytes(Crypto.encrypt(plainBytes, PASSWORD), PASSWORD);
            assertArrayEquals(plainBytes, roundtrippedPlainBytes);

            stream.write(42);
        }
    }

    private String readBackupFromResource(final String filename) throws IOException {
        final BufferedReader reader = new BufferedReader(
                new InputStreamReader(getClass().getResourceAsStream(filename), StandardCharsets.UTF_8));
        final StringBuilder backup = new StringBuilder();
        CharStreams.copy(reader, backup);
        reader.close();

        return backup.toString();
    }
}
