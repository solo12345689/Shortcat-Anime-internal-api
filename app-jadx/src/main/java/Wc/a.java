package Wc;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f20842d = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f20843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f20844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f20845c;

    public a(Context context) {
        this.f20844b = context;
        this.f20845c = context.getSharedPreferences("host.exp.exponent.SharedPreferences", 0);
    }

    protected File a() {
        return new File(this.f20844b.getNoBackupFilesDir(), "expo_notifications_installation_uuid.txt");
    }

    public String b() {
        String strC = c();
        if (strC != null) {
            return strC;
        }
        String string = UUID.randomUUID().toString();
        this.f20843a = string;
        try {
            e(string);
        } catch (IOException e10) {
            Log.e(f20842d, "Error while writing new UUID. " + e10);
        }
        return this.f20843a;
    }

    public String c() {
        String str = this.f20843a;
        if (str != null) {
            return str;
        }
        String strD = d(new File(this.f20844b.getNoBackupFilesDir(), "expo_notifications_installation_uuid.txt"));
        this.f20843a = strD;
        if (strD != null) {
            return strD;
        }
        String string = this.f20845c.getString("uuid", null);
        this.f20843a = string;
        if (string != null) {
            try {
                e(string);
                this.f20845c.edit().remove("uuid").apply();
            } catch (IOException e10) {
                Log.e(f20842d, "Error while migrating UUID from legacy storage. " + e10);
            }
            return this.f20843a;
        }
        String strD2 = d(new File(this.f20844b.getNoBackupFilesDir(), "expo_installation_uuid.txt"));
        this.f20843a = strD2;
        if (strD2 == null) {
            return strD2;
        }
        try {
            e(strD2);
        } catch (IOException e11) {
            Log.e(f20842d, "Error while migrating UUID from legacy storage. " + e11);
        }
        return this.f20843a;
    }

    protected String d(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                try {
                    String string = UUID.fromString(bufferedReader.readLine()).toString();
                    bufferedReader.close();
                    fileReader.close();
                    return string;
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    fileReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException | IllegalArgumentException unused) {
            return null;
        }
    }

    protected void e(String str) throws IOException {
        FileWriter fileWriter = new FileWriter(a());
        try {
            fileWriter.write(str);
            fileWriter.close();
        } catch (Throwable th2) {
            try {
                fileWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
