.class public final Lcom/facebook/react/views/textinput/k;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/textinput/k$a;
    }
.end annotation


# static fields
.field public static final e:Lcom/facebook/react/views/textinput/k$a;


# instance fields
.field private final a:Lcom/facebook/react/views/textinput/j;

.field private final b:Lcom/facebook/react/uimanager/events/EventDispatcher;

.field private c:Z

.field private d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/textinput/k$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/textinput/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/textinput/k;->e:Lcom/facebook/react/views/textinput/k$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/view/inputmethod/InputConnection;Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/uimanager/events/EventDispatcher;)V
    .locals 1

    .line 1
    const-string v0, "target"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "reactContext"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p2, "editText"

    .line 12
    .line 13
    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p2, "eventDispatcher"

    .line 17
    .line 18
    invoke-static {p4, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-direct {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    .line 23
    .line 24
    .line 25
    iput-object p3, p0, Lcom/facebook/react/views/textinput/k;->a:Lcom/facebook/react/views/textinput/j;

    .line 26
    .line 27
    iput-object p4, p0, Lcom/facebook/react/views/textinput/k;->b:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 28
    .line 29
    return-void
.end method

.method private final b(Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "\n"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p1, "Enter"

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/textinput/k;->a:Lcom/facebook/react/views/textinput/j;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/facebook/react/uimanager/f0;->f(Landroid/view/View;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/facebook/react/views/textinput/k;->b:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 18
    .line 19
    new-instance v2, Lcom/facebook/react/views/textinput/o;

    .line 20
    .line 21
    iget-object v3, p0, Lcom/facebook/react/views/textinput/k;->a:Lcom/facebook/react/views/textinput/j;

    .line 22
    .line 23
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-direct {v2, v0, v3, p1}, Lcom/facebook/react/views/textinput/o;-><init>(IILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method private final c(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/k;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/facebook/react/views/textinput/k;->d:Ljava/lang/String;

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/react/views/textinput/k;->b(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public beginBatchEdit()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/facebook/react/views/textinput/k;->c:Z

    .line 3
    .line 4
    invoke-super {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->beginBatchEdit()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public commitText(Ljava/lang/CharSequence;I)Z
    .locals 3

    .line 1
    const-string v0, "text"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x2

    .line 15
    if-gt v1, v2, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    const-string v0, "Backspace"

    .line 24
    .line 25
    :cond_0
    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/k;->c(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->commitText(Ljava/lang/CharSequence;I)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1
.end method

.method public deleteSurroundingText(II)Z
    .locals 1

    .line 1
    const-string v0, "Backspace"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/k;->b(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingText(II)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public endBatchEdit()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/facebook/react/views/textinput/k;->c:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/views/textinput/k;->d:Ljava/lang/String;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/k;->b(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/facebook/react/views/textinput/k;->d:Ljava/lang/String;

    .line 13
    .line 14
    :cond_0
    invoke-super {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->endBatchEdit()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v1, 0x30

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-gt v1, v0, :cond_0

    .line 20
    .line 21
    const/16 v1, 0x3a

    .line 22
    .line 23
    if-ge v0, v1, :cond_0

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/16 v1, 0x42

    .line 31
    .line 32
    if-eq v0, v1, :cond_2

    .line 33
    .line 34
    const/16 v1, 0x43

    .line 35
    .line 36
    if-eq v0, v1, :cond_1

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getNumber()C

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/k;->b(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const-string v0, "Backspace"

    .line 53
    .line 54
    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/k;->b(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const-string v0, "Enter"

    .line 59
    .line 60
    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/k;->b(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    :goto_0
    invoke-super {p0, p1}, Landroid/view/inputmethod/InputConnectionWrapper;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1
.end method

.method public setComposingText(Ljava/lang/CharSequence;I)Z
    .locals 4

    .line 1
    const-string v0, "text"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/textinput/k;->a:Lcom/facebook/react/views/textinput/j;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/TextView;->getSelectionStart()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Lcom/facebook/react/views/textinput/k;->a:Lcom/facebook/react/views/textinput/j;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->setComposingText(Ljava/lang/CharSequence;I)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object p2, p0, Lcom/facebook/react/views/textinput/k;->a:Lcom/facebook/react/views/textinput/j;

    .line 23
    .line 24
    invoke-virtual {p2}, Landroid/widget/TextView;->getSelectionStart()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    const/4 v2, 0x0

    .line 29
    const/4 v3, 0x1

    .line 30
    if-ne v0, v1, :cond_0

    .line 31
    .line 32
    move v1, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v1, v2

    .line 35
    :goto_0
    if-ne p2, v0, :cond_1

    .line 36
    .line 37
    move v2, v3

    .line 38
    :cond_1
    if-lt p2, v0, :cond_5

    .line 39
    .line 40
    if-gtz p2, :cond_2

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    if-nez v1, :cond_3

    .line 44
    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_3
    iget-object v0, p0, Lcom/facebook/react/views/textinput/k;->a:Lcom/facebook/react/views/textinput/j;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    sub-int/2addr p2, v3

    .line 57
    invoke-interface {v0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    invoke-static {p2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    goto :goto_1

    .line 66
    :cond_4
    const/4 p2, 0x0

    .line 67
    :goto_1
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    goto :goto_3

    .line 72
    :cond_5
    :goto_2
    const-string p2, "Backspace"

    .line 73
    .line 74
    :goto_3
    invoke-direct {p0, p2}, Lcom/facebook/react/views/textinput/k;->c(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return p1
.end method
