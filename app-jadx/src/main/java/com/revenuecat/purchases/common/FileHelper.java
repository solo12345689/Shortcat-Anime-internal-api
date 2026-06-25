package com.revenuecat.purchases.common;

import Cf.i;
import Cf.l;
import Df.C1271d;
import Td.L;
import android.content.Context;
import com.revenuecat.purchases.utils.FileExtensionsKt;
import fe.c;
import fe.v;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001c\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u001e\u0010\rJ5\u0010#\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b%\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/common/FileHelper;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "", "filePath", "Lkotlin/Function1;", "Ljava/io/BufferedReader;", "LTd/L;", "contentBlock", "openBufferedReader", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Ljava/io/File;", "getFileInFilesDir", "(Ljava/lang/String;)Ljava/io/File;", "getFilesDir", "()Ljava/io/File;", "", "fileSizeInKB", "(Ljava/lang/String;)D", "contentToAppend", "appendToFile", "(Ljava/lang/String;Ljava/lang/String;)V", "", "deleteFile", "(Ljava/lang/String;)Z", "LCf/i;", "block", "readFilePerLines", "", "numberOfLinesToRemove", "", "onException", "removeFirstLinesFromFile", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "fileIsEmpty", "Landroid/content/Context;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileHelper {
    private final Context applicationContext;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.FileHelper$readFilePerLines$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/BufferedReader;", "bufferedReader", "LTd/L;", "invoke", "(Ljava/io/BufferedReader;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function1 function1) {
            super(1);
            this.$block = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BufferedReader) obj);
            return L.f17438a;
        }

        public final void invoke(BufferedReader bufferedReader) {
            AbstractC5504s.h(bufferedReader, "bufferedReader");
            this.$block.invoke(v.d(bufferedReader));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.FileHelper$removeFirstLinesFromFile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LCf/i;", "", "sequence", "LTd/L;", "invoke", "(LCf/i;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40791 extends AbstractC5506u implements Function1 {
        final /* synthetic */ int $numberOfLinesToRemove;
        final /* synthetic */ StringBuilder $textToAppend;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40791(int i10, StringBuilder sb2) {
            super(1);
            this.$numberOfLinesToRemove = i10;
            this.$textToAppend = sb2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((i) obj);
            return L.f17438a;
        }

        public final void invoke(i sequence) {
            AbstractC5504s.h(sequence, "sequence");
            i iVarX = l.x(sequence, this.$numberOfLinesToRemove);
            StringBuilder sb2 = this.$textToAppend;
            Iterator it = iVarX.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append("\n");
            }
        }
    }

    public FileHelper(Context applicationContext) {
        AbstractC5504s.h(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    private final File getFileInFilesDir(String filePath) {
        return new File(getFilesDir(), filePath);
    }

    private final File getFilesDir() {
        File filesDir = this.applicationContext.getFilesDir();
        AbstractC5504s.g(filesDir, "applicationContext.filesDir");
        return filesDir;
    }

    private final void openBufferedReader(String filePath, Function1 contentBlock) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(getFileInFilesDir(filePath));
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    contentBlock.invoke(bufferedReader);
                    L l10 = L.f17438a;
                    c.a(bufferedReader, null);
                    c.a(inputStreamReader, null);
                    c.a(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ void removeFirstLinesFromFile$default(FileHelper fileHelper, String str, int i10, Function1 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        fileHelper.removeFirstLinesFromFile(str, i10, function1);
    }

    public final void appendToFile(String filePath, String contentToAppend) throws IOException {
        AbstractC5504s.h(filePath, "filePath");
        AbstractC5504s.h(contentToAppend, "contentToAppend");
        File fileInFilesDir = getFileInFilesDir(filePath);
        File parentFile = fileInFilesDir.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileInFilesDir, true);
        try {
            byte[] bytes = contentToAppend.getBytes(C1271d.f3718b);
            AbstractC5504s.g(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            L l10 = L.f17438a;
            c.a(fileOutputStream, null);
        } finally {
        }
    }

    public final boolean deleteFile(String filePath) {
        AbstractC5504s.h(filePath, "filePath");
        return getFileInFilesDir(filePath).delete();
    }

    public final boolean fileIsEmpty(String filePath) {
        AbstractC5504s.h(filePath, "filePath");
        File fileInFilesDir = getFileInFilesDir(filePath);
        return !fileInFilesDir.exists() || fileInFilesDir.length() == 0;
    }

    public final double fileSizeInKB(String filePath) {
        AbstractC5504s.h(filePath, "filePath");
        return FileExtensionsKt.getSizeInKB(getFileInFilesDir(filePath));
    }

    public final void readFilePerLines(String filePath, Function1 block) throws IOException {
        AbstractC5504s.h(filePath, "filePath");
        AbstractC5504s.h(block, "block");
        openBufferedReader(filePath, new AnonymousClass1(block));
    }

    public final void removeFirstLinesFromFile(String filePath, int numberOfLinesToRemove, Function1 onException) {
        AbstractC5504s.h(filePath, "filePath");
        try {
            StringBuilder sb2 = new StringBuilder();
            readFilePerLines(filePath, new C40791(numberOfLinesToRemove, sb2));
            deleteFile(filePath);
            String string = sb2.toString();
            AbstractC5504s.g(string, "textToAppend.toString()");
            appendToFile(filePath, string);
        } catch (FileNotFoundException e10) {
            if (onException != null) {
                onException.invoke(e10);
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "FileHelper: file not found when trying to remove first lines from file: " + filePath + ". Ignoring.", e10);
        } catch (Throwable th2) {
            if (onException != null) {
                onException.invoke(th2);
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "FileHelper: error removing first lines from file: " + filePath + ". Ignoring.", th2);
            throw th2;
        }
    }
}
