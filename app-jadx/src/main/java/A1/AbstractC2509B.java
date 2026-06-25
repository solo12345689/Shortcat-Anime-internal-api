package a1;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: a1.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2509B implements InterfaceInputConnectionC2508A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f23516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InputConnection f23517b;

    public AbstractC2509B(InputConnection inputConnection, Function1 function1) {
        this.f23516a = function1;
        this.f23517b = inputConnection;
    }

    @Override // a1.InterfaceInputConnectionC2508A
    public final void a() {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            b(inputConnection);
            this.f23517b = null;
        }
    }

    protected abstract void b(InputConnection inputConnection);

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    protected final InputConnection c() {
        return this.f23517b;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.f23517b != null) {
            a();
            this.f23516a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i10);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i10) {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i10, int i11) {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i10, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i10, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z10) {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        InputConnection inputConnection = this.f23517b;
        if (inputConnection != null) {
            return inputConnection.setSelection(i10, i11);
        }
        return false;
    }
}
