.class public Lcom/facebook/react/views/textinput/j;
.super Landroidx/appcompat/widget/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/textinput/j$a;,
        Lcom/facebook/react/views/textinput/j$b;,
        Lcom/facebook/react/views/textinput/j$c;
    }
.end annotation


# static fields
.field public static final r0:Lcom/facebook/react/views/textinput/j$a;

.field private static final s0:Z

.field private static final t0:Landroid/text/method/KeyListener;


# instance fields
.field private A:Ljava/lang/String;

.field private B:I

.field private C:I

.field private D:Z

.field private E:Z

.field private F:Z

.field private G:Z

.field private H:Ljava/lang/String;

.field private I:LH7/v;

.field private final g:Landroid/view/inputmethod/InputMethodManager;

.field private final h:Ljava/lang/String;

.field private i:Z

.field private final j:I

.field private final k:I

.field private l:I

.field private l0:Lcom/facebook/react/uimanager/a0;

.field private m:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private m0:Z

.field private n:I

.field private n0:Z

.field private o:Z

.field private o0:Lcom/facebook/react/uimanager/events/EventDispatcher;

.field private p:Ljava/lang/String;

.field private p0:Lcom/facebook/react/views/textinput/j$c;

.field private q:Ljava/util/List;

.field private q0:Ljava/lang/String;

.field private r:Z

.field private s:Lcom/facebook/react/views/textinput/L;

.field private t:Lcom/facebook/react/views/textinput/a;

.field private u:Lcom/facebook/react/views/textinput/K;

.field private v:Lcom/facebook/react/views/textinput/j$b;

.field private w:Z

.field private x:Z

.field private final y:Lcom/facebook/react/views/text/r;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/textinput/j$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/textinput/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/textinput/j;->r0:Lcom/facebook/react/views/textinput/j$a;

    .line 8
    .line 9
    sget-object v0, LY6/a;->a:LY6/a;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    sput-boolean v0, Lcom/facebook/react/views/textinput/j;->s0:Z

    .line 13
    .line 14
    invoke-static {}, Landroid/text/method/QwertyKeyListener;->getInstanceForFullKeyboard()Landroid/text/method/QwertyKeyListener;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "getInstanceForFullKeyboard(...)"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/facebook/react/views/textinput/j;->t0:Landroid/text/method/KeyListener;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/l;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    const-class v0, Lcom/facebook/react/views/textinput/j;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "getSimpleName(...)"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/facebook/react/views/textinput/j;->h:Ljava/lang/String;

    .line 21
    .line 22
    const/4 v0, -0x1

    .line 23
    iput v0, p0, Lcom/facebook/react/views/textinput/j;->B:I

    .line 24
    .line 25
    iput v0, p0, Lcom/facebook/react/views/textinput/j;->C:I

    .line 26
    .line 27
    sget-object v0, LH7/v;->b:LH7/v;

    .line 28
    .line 29
    iput-object v0, p0, Lcom/facebook/react/views/textinput/j;->I:LH7/v;

    .line 30
    .line 31
    const-string v0, "input_method"

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string v0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    .line 38
    .line 39
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 43
    .line 44
    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->g:Landroid/view/inputmethod/InputMethodManager;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/widget/TextView;->getGravity()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    const v0, 0x800007

    .line 51
    .line 52
    .line 53
    and-int/2addr p1, v0

    .line 54
    iput p1, p0, Lcom/facebook/react/views/textinput/j;->j:I

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/widget/TextView;->getGravity()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    and-int/lit8 p1, p1, 0x70

    .line 61
    .line 62
    iput p1, p0, Lcom/facebook/react/views/textinput/j;->k:I

    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    iput p1, p0, Lcom/facebook/react/views/textinput/j;->l:I

    .line 66
    .line 67
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->i:Z

    .line 68
    .line 69
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->r:Z

    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iput v0, p0, Lcom/facebook/react/views/textinput/j;->n:I

    .line 79
    .line 80
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->v:Lcom/facebook/react/views/textinput/j$b;

    .line 81
    .line 82
    if-nez v0, :cond_0

    .line 83
    .line 84
    new-instance v0, Lcom/facebook/react/views/textinput/j$b;

    .line 85
    .line 86
    invoke-direct {v0}, Lcom/facebook/react/views/textinput/j$b;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Lcom/facebook/react/views/textinput/j;->v:Lcom/facebook/react/views/textinput/j$b;

    .line 90
    .line 91
    :cond_0
    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->u:Lcom/facebook/react/views/textinput/K;

    .line 92
    .line 93
    new-instance v0, Lcom/facebook/react/views/text/r;

    .line 94
    .line 95
    invoke-direct {v0}, Lcom/facebook/react/views/text/r;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object v0, p0, Lcom/facebook/react/views/textinput/j;->y:Lcom/facebook/react/views/text/r;

    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->u()V

    .line 101
    .line 102
    .line 103
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 104
    .line 105
    const/16 v1, 0x1a

    .line 106
    .line 107
    if-lt v0, v1, :cond_1

    .line 108
    .line 109
    const/16 v1, 0x1b

    .line 110
    .line 111
    if-gt v0, v1, :cond_1

    .line 112
    .line 113
    const/4 v0, 0x1

    .line 114
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 115
    .line 116
    .line 117
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    invoke-virtual {p0}, Landroid/view/View;->getImportantForAccessibility()I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    new-instance v1, Lcom/facebook/react/views/textinput/j$e;

    .line 126
    .line 127
    invoke-direct {v1, p0, p1, v0}, Lcom/facebook/react/views/textinput/j$e;-><init>(Lcom/facebook/react/views/textinput/j;ZI)V

    .line 128
    .line 129
    .line 130
    invoke-static {p0, v1}, Landroidx/core/view/a0;->k0(Landroid/view/View;Landroidx/core/view/a;)V

    .line 131
    .line 132
    .line 133
    new-instance p1, Lcom/facebook/react/views/textinput/j$d;

    .line 134
    .line 135
    invoke-direct {p1, p0}, Lcom/facebook/react/views/textinput/j$d;-><init>(Lcom/facebook/react/views/textinput/j;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/l;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setCustomInsertionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method private final D()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v0, v0, 0x90

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private final F(Landroid/text/SpannableStringBuilder;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/widget/TextView;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-class v2, Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    array-length v2, v1

    .line 19
    move v4, v3

    .line 20
    :goto_0
    if-ge v4, v2, :cond_4

    .line 21
    .line 22
    aget-object v5, v1, v4

    .line 23
    .line 24
    invoke-interface {v0, v5}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    and-int/lit8 v7, v6, 0x21

    .line 29
    .line 30
    const/16 v8, 0x21

    .line 31
    .line 32
    if-ne v7, v8, :cond_0

    .line 33
    .line 34
    const/4 v7, 0x1

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    move v7, v3

    .line 37
    :goto_1
    instance-of v8, v5, LP7/k;

    .line 38
    .line 39
    if-eqz v8, :cond_1

    .line 40
    .line 41
    invoke-interface {v0, v5}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    if-nez v7, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-interface {v0, v5}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    invoke-interface {v0, v5}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    invoke-interface {v0, v5}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v9, Lcom/facebook/react/views/textinput/j;->r0:Lcom/facebook/react/views/textinput/j$a;

    .line 59
    .line 60
    invoke-static {v9, v0, p1, v7, v8}, Lcom/facebook/react/views/textinput/j$a;->a(Lcom/facebook/react/views/textinput/j$a;Landroid/text/Editable;Landroid/text/SpannableStringBuilder;II)Z

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    if-eqz v9, :cond_3

    .line 65
    .line 66
    invoke-virtual {p1, v5, v7, v8, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 67
    .line 68
    .line 69
    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    return-void

    .line 73
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string v0, "Required value was null."

    .line 76
    .line 77
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1
.end method

.method private final G(II)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p1, v0, :cond_0

    .line 3
    .line 4
    if-eq p2, v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/views/textinput/j;->w(I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-direct {p0, p2}, Lcom/facebook/react/views/textinput/j;->w(I)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/textinput/j;->setSelection(II)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method private final I(Lcom/facebook/react/views/text/i;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->D()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->h()Landroid/text/Spannable;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->b()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/textinput/j;->v(I)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    :goto_0
    return-void

    .line 33
    :cond_1
    sget-boolean v0, Lcom/facebook/react/views/textinput/j;->s0:Z

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->h:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->h()Landroid/text/Spannable;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    new-instance v4, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v5, "maybeSetText["

    .line 57
    .line 58
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, "]: current text: "

    .line 65
    .line 66
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v1, " update: "

    .line 73
    .line 74
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {v0, v1}, Lz5/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->h()Landroid/text/Spannable;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/j;->F(Landroid/text/SpannableStringBuilder;)V

    .line 97
    .line 98
    .line 99
    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/j;->V(Landroid/text/SpannableStringBuilder;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->a()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    iput-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->o:Z

    .line 107
    .line 108
    const/4 v1, 0x1

    .line 109
    iput-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->m0:Z

    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->h()Landroid/text/Spannable;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    const/4 v2, 0x0

    .line 120
    if-nez v1, :cond_3

    .line 121
    .line 122
    const/4 v0, 0x0

    .line 123
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    if-eqz v1, :cond_5

    .line 132
    .line 133
    invoke-virtual {p0}, Landroid/widget/TextView;->length()I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    invoke-interface {v1, v2, v3, v0}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 138
    .line 139
    .line 140
    :goto_1
    iput-boolean v2, p0, Lcom/facebook/react/views/textinput/j;->m0:Z

    .line 141
    .line 142
    invoke-virtual {p0}, Landroid/widget/TextView;->getBreakStrategy()I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->j()I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eq v0, v1, :cond_4

    .line 151
    .line 152
    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->j()I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setBreakStrategy(I)V

    .line 157
    .line 158
    .line 159
    :cond_4
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->d0()V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 164
    .line 165
    const-string v0, "Required value was null."

    .line 166
    .line 167
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw p1
.end method

.method private final M()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->t:Lcom/facebook/react/views/textinput/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/facebook/react/views/textinput/a;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->Q()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final O()Z
    .locals 2

    .line 1
    const/16 v0, 0x82

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-super {p0, v0, v1}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/widget/TextView;->getShowSoftInputOnFocus()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->T()Z

    .line 21
    .line 22
    .line 23
    :cond_0
    return v0
.end method

.method private final Q()V
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/facebook/react/uimanager/f0;->d(Landroid/view/View;)Lcom/facebook/react/bridge/ReactContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-boolean v1, LY6/a;->f:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/facebook/react/views/textinput/j;->l0:Lcom/facebook/react/uimanager/a0;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->isBridgeless()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    new-instance v1, Lcom/facebook/react/views/textinput/p;

    .line 20
    .line 21
    invoke-direct {v1, p0}, Lcom/facebook/react/views/textinput/p;-><init>(Landroid/widget/EditText;)V

    .line 22
    .line 23
    .line 24
    const-class v2, Lcom/facebook/react/uimanager/UIManagerModule;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/facebook/react/uimanager/UIManagerModule;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/uimanager/UIManagerModule;->setViewLocalData(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method private final U(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;LK1/g;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-virtual {p1, v0, v1, p2}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-static {p2}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {p3, v0}, LK1/g;->test(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method private final V(Landroid/text/SpannableStringBuilder;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/textinput/c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/facebook/react/views/textinput/c;-><init>(Lcom/facebook/react/views/textinput/j;)V

    .line 4
    .line 5
    .line 6
    const-class v1, LP7/d;

    .line 7
    .line 8
    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/react/views/textinput/j;->U(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;LK1/g;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/facebook/react/views/textinput/d;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/facebook/react/views/textinput/d;-><init>(Lcom/facebook/react/views/textinput/j;)V

    .line 14
    .line 15
    .line 16
    const-class v1, LP7/e;

    .line 17
    .line 18
    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/react/views/textinput/j;->U(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;LK1/g;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lcom/facebook/react/views/textinput/e;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Lcom/facebook/react/views/textinput/e;-><init>(Lcom/facebook/react/views/textinput/j;)V

    .line 24
    .line 25
    .line 26
    const-class v1, LP7/g;

    .line 27
    .line 28
    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/react/views/textinput/j;->U(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;LK1/g;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lcom/facebook/react/views/textinput/f;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Lcom/facebook/react/views/textinput/f;-><init>(Lcom/facebook/react/views/textinput/j;)V

    .line 34
    .line 35
    .line 36
    const-class v1, LP7/l;

    .line 37
    .line 38
    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/react/views/textinput/j;->U(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;LK1/g;)V

    .line 39
    .line 40
    .line 41
    new-instance v0, Lcom/facebook/react/views/textinput/g;

    .line 42
    .line 43
    invoke-direct {v0, p0}, Lcom/facebook/react/views/textinput/g;-><init>(Lcom/facebook/react/views/textinput/j;)V

    .line 44
    .line 45
    .line 46
    const-class v1, LP7/o;

    .line 47
    .line 48
    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/react/views/textinput/j;->U(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;LK1/g;)V

    .line 49
    .line 50
    .line 51
    new-instance v0, Lcom/facebook/react/views/textinput/h;

    .line 52
    .line 53
    invoke-direct {v0, p0}, Lcom/facebook/react/views/textinput/h;-><init>(Lcom/facebook/react/views/textinput/j;)V

    .line 54
    .line 55
    .line 56
    const-class v1, LP7/a;

    .line 57
    .line 58
    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/react/views/textinput/j;->U(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;LK1/g;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, Lcom/facebook/react/views/textinput/i;

    .line 62
    .line 63
    invoke-direct {v0, p0}, Lcom/facebook/react/views/textinput/i;-><init>(Lcom/facebook/react/views/textinput/j;)V

    .line 64
    .line 65
    .line 66
    const-class v1, LP7/c;

    .line 67
    .line 68
    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/react/views/textinput/j;->U(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;LK1/g;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method private static final W(Lcom/facebook/react/views/textinput/j;LP7/d;)Z
    .locals 1

    .line 1
    const-string v0, "span"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/text/style/AbsoluteSizeSpan;->getSize()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget-object p0, p0, Lcom/facebook/react/views/textinput/j;->y:Lcom/facebook/react/views/text/r;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/facebook/react/views/text/r;->c()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-ne p1, p0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method private static final X(Lcom/facebook/react/views/textinput/j;LP7/e;)Z
    .locals 1

    .line 1
    const-string v0, "span"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/text/style/BackgroundColorSpan;->getBackgroundColor()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {p0}, Lcom/facebook/react/uimanager/a;->i(Landroid/view/View;)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-ne p1, p0, :cond_1

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method private static final Y(Lcom/facebook/react/views/textinput/j;LP7/g;)Z
    .locals 1

    .line 1
    const-string v0, "span"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/text/style/ForegroundColorSpan;->getForegroundColor()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {p0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-ne p1, p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method private static final Z(Lcom/facebook/react/views/textinput/j;LP7/l;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaintFlags()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/lit8 p0, p0, 0x10

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method private static final a0(Lcom/facebook/react/views/textinput/j;LP7/o;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaintFlags()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/lit8 p0, p0, 0x8

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method private static final b0(Lcom/facebook/react/views/textinput/j;LP7/a;)Z
    .locals 1

    .line 1
    const-string v0, "span"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LP7/a;->b()F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget-object p0, p0, Lcom/facebook/react/views/textinput/j;->y:Lcom/facebook/react/views/text/r;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/facebook/react/views/text/r;->d()F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    cmpg-float p0, p1, p0

    .line 17
    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method private static final c0(Lcom/facebook/react/views/textinput/j;LP7/c;)Z
    .locals 2

    .line 1
    const-string v0, "span"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LP7/c;->c()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget v1, p0, Lcom/facebook/react/views/textinput/j;->C:I

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, LP7/c;->a()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lcom/facebook/react/views/textinput/j;->A:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, LP7/c;->d()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget v1, p0, Lcom/facebook/react/views/textinput/j;->B:I

    .line 31
    .line 32
    if-ne v0, v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, LP7/c;->b()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0}, Landroid/widget/TextView;->getFontFeatureSettings()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_0

    .line 47
    .line 48
    const/4 p0, 0x1

    .line 49
    return p0

    .line 50
    :cond_0
    const/4 p0, 0x0

    .line 51
    return p0
.end method

.method private final d0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->l0:Lcom/facebook/react/uimanager/a0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    :goto_0
    return-void

    .line 14
    :cond_1
    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    move v2, v1

    .line 29
    goto :goto_2

    .line 30
    :cond_3
    :goto_1
    const/4 v2, 0x1

    .line 31
    :goto_2
    new-instance v3, Landroid/text/SpannableStringBuilder;

    .line 32
    .line 33
    invoke-direct {v3}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    if-nez v2, :cond_4

    .line 39
    .line 40
    :try_start_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-interface {v0, v1, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v3, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    goto :goto_3

    .line 52
    :catch_0
    move-exception v0

    .line 53
    iget-object v4, p0, Lcom/facebook/react/views/textinput/j;->h:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v4, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :cond_4
    :goto_3
    if-eqz v2, :cond_6

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v2, "getHint(...)"

    .line 71
    .line 72
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-lez v0, :cond_5

    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v3, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 86
    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_5
    invoke-static {p0}, LC7/a;->c(Landroid/view/View;)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    const/4 v2, 0x2

    .line 94
    if-eq v0, v2, :cond_6

    .line 95
    .line 96
    const-string v0, "I"

    .line 97
    .line 98
    invoke-virtual {v3, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 99
    .line 100
    .line 101
    :cond_6
    :goto_4
    invoke-direct {p0, v3}, Lcom/facebook/react/views/textinput/j;->t(Landroid/text/SpannableStringBuilder;)V

    .line 102
    .line 103
    .line 104
    new-instance v0, LP7/n;

    .line 105
    .line 106
    new-instance v2, Landroid/text/TextPaint;

    .line 107
    .line 108
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-direct {v2, v4}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    .line 113
    .line 114
    .line 115
    invoke-direct {v0, v2}, LP7/n;-><init>(Landroid/text/TextPaint;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    const/16 v4, 0x12

    .line 123
    .line 124
    invoke-virtual {v3, v0, v1, v2, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 125
    .line 126
    .line 127
    sget-object v0, Lcom/facebook/react/views/text/s;->a:Lcom/facebook/react/views/text/s;

    .line 128
    .line 129
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    invoke-virtual {v0, v1, v3}, Lcom/facebook/react/views/text/s;->A(ILandroid/text/Spannable;)V

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method public static synthetic e(Lcom/facebook/react/views/textinput/j;LP7/g;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/views/textinput/j;->Y(Lcom/facebook/react/views/textinput/j;LP7/g;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final e0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->q0:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    sparse-switch v2, :sswitch_data_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :sswitch_0
    const-string v2, "send"

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x4

    .line 24
    goto :goto_0

    .line 25
    :sswitch_1
    const-string v2, "none"

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :sswitch_2
    const-string v2, "next"

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const/4 v1, 0x5

    .line 46
    goto :goto_0

    .line 47
    :sswitch_3
    const-string v2, "done"

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    goto :goto_0

    .line 54
    :sswitch_4
    const-string v2, "go"

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    const/4 v1, 0x2

    .line 64
    goto :goto_0

    .line 65
    :sswitch_5
    const-string v2, "search"

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_4

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    const/4 v1, 0x3

    .line 75
    goto :goto_0

    .line 76
    :sswitch_6
    const-string v2, "previous"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_5

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_5
    const/4 v1, 0x7

    .line 86
    :cond_6
    :goto_0
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->r:Z

    .line 87
    .line 88
    if-eqz v0, :cond_7

    .line 89
    .line 90
    const/high16 v0, 0x2000000

    .line 91
    .line 92
    or-int/2addr v1, v0

    .line 93
    :cond_7
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :sswitch_data_0
    .sparse-switch
        -0x4bec4509 -> :sswitch_6
        -0x36059a58 -> :sswitch_5
        0xce8 -> :sswitch_4
        0x2f2382 -> :sswitch_3
        0x338af3 -> :sswitch_2
        0x33af38 -> :sswitch_1
        0x35cf88 -> :sswitch_0
    .end sparse-switch
.end method

.method public static synthetic f(Lcom/facebook/react/views/textinput/j;LP7/e;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/views/textinput/j;->X(Lcom/facebook/react/views/textinput/j;LP7/e;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic g(Lcom/facebook/react/views/textinput/j;LP7/c;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/views/textinput/j;->c0(Lcom/facebook/react/views/textinput/j;LP7/c;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final getTextWatcherDelegator()Lcom/facebook/react/views/textinput/j$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->p0:Lcom/facebook/react/views/textinput/j$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/facebook/react/views/textinput/j$c;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/facebook/react/views/textinput/j$c;-><init>(Lcom/facebook/react/views/textinput/j;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/facebook/react/views/textinput/j;->p0:Lcom/facebook/react/views/textinput/j$c;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->p0:Lcom/facebook/react/views/textinput/j$c;

    .line 13
    .line 14
    return-object v0
.end method

.method public static synthetic h(Lcom/facebook/react/views/textinput/j;LP7/l;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/views/textinput/j;->Z(Lcom/facebook/react/views/textinput/j;LP7/l;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic i(Lcom/facebook/react/views/textinput/j;LP7/d;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/views/textinput/j;->W(Lcom/facebook/react/views/textinput/j;LP7/d;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic j(Lcom/facebook/react/views/textinput/j;LP7/o;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/views/textinput/j;->a0(Lcom/facebook/react/views/textinput/j;LP7/o;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic k(Lcom/facebook/react/views/textinput/j;LP7/a;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/views/textinput/j;->b0(Lcom/facebook/react/views/textinput/j;LP7/a;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic l(Lcom/facebook/react/views/textinput/j;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/views/textinput/j;->E:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic m()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/textinput/j;->s0:Z

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic n()Landroid/text/method/KeyListener;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/textinput/j;->t0:Landroid/text/method/KeyListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic o(Lcom/facebook/react/views/textinput/j;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/views/textinput/j;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic p(Lcom/facebook/react/views/textinput/j;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/views/textinput/j;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic q(Lcom/facebook/react/views/textinput/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->M()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic r(Lcom/facebook/react/views/textinput/j;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->O()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic s(Lcom/facebook/react/views/textinput/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->d0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final t(Landroid/text/SpannableStringBuilder;)V
    .locals 10

    .line 1
    new-instance v0, LP7/d;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/views/textinput/j;->y:Lcom/facebook/react/views/text/r;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/facebook/react/views/text/r;->c()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, LP7/d;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    const v3, 0xff0012

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 21
    .line 22
    .line 23
    new-instance v0, LP7/g;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-direct {v0, v1}, LP7/g;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0}, Lcom/facebook/react/uimanager/a;->i(Landroid/view/View;)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    new-instance v1, LP7/e;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-direct {v1, v0}, LP7/e;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 65
    .line 66
    .line 67
    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaintFlags()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    and-int/lit8 v0, v0, 0x10

    .line 72
    .line 73
    if-eqz v0, :cond_1

    .line 74
    .line 75
    new-instance v0, LP7/l;

    .line 76
    .line 77
    invoke-direct {v0}, LP7/l;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 85
    .line 86
    .line 87
    :cond_1
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaintFlags()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    and-int/lit8 v0, v0, 0x8

    .line 92
    .line 93
    if-eqz v0, :cond_2

    .line 94
    .line 95
    new-instance v0, LP7/o;

    .line 96
    .line 97
    invoke-direct {v0}, LP7/o;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 105
    .line 106
    .line 107
    :cond_2
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->y:Lcom/facebook/react/views/text/r;

    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/facebook/react/views/text/r;->d()F

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-nez v1, :cond_3

    .line 118
    .line 119
    new-instance v1, LP7/a;

    .line 120
    .line 121
    invoke-direct {v1, v0}, LP7/a;-><init>(F)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 129
    .line 130
    .line 131
    :cond_3
    iget v0, p0, Lcom/facebook/react/views/textinput/j;->C:I

    .line 132
    .line 133
    const/4 v1, -0x1

    .line 134
    if-ne v0, v1, :cond_4

    .line 135
    .line 136
    iget v0, p0, Lcom/facebook/react/views/textinput/j;->B:I

    .line 137
    .line 138
    if-ne v0, v1, :cond_4

    .line 139
    .line 140
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->A:Ljava/lang/String;

    .line 141
    .line 142
    if-nez v0, :cond_4

    .line 143
    .line 144
    invoke-virtual {p0}, Landroid/widget/TextView;->getFontFeatureSettings()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-eqz v0, :cond_5

    .line 149
    .line 150
    :cond_4
    new-instance v4, LP7/c;

    .line 151
    .line 152
    iget v5, p0, Lcom/facebook/react/views/textinput/j;->C:I

    .line 153
    .line 154
    iget v6, p0, Lcom/facebook/react/views/textinput/j;->B:I

    .line 155
    .line 156
    invoke-virtual {p0}, Landroid/widget/TextView;->getFontFeatureSettings()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    iget-object v8, p0, Lcom/facebook/react/views/textinput/j;->A:Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    const-string v0, "getAssets(...)"

    .line 171
    .line 172
    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-direct/range {v4 .. v9}, LP7/c;-><init>(IILjava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    invoke-virtual {p1, v4, v2, v0, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 183
    .line 184
    .line 185
    :cond_5
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->y:Lcom/facebook/react/views/text/r;

    .line 186
    .line 187
    invoke-virtual {v0}, Lcom/facebook/react/views/text/r;->e()F

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-nez v1, :cond_6

    .line 196
    .line 197
    new-instance v1, LP7/b;

    .line 198
    .line 199
    invoke-direct {v1, v0}, LP7/b;-><init>(F)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 207
    .line 208
    .line 209
    :cond_6
    return-void
.end method

.method private final w(I)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    :goto_0
    int-to-double v1, p1

    .line 20
    int-to-double v3, v0

    .line 21
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(DD)D

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    const-wide/16 v2, 0x0

    .line 26
    .line 27
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(DD)D

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    double-to-int p1, v0

    .line 32
    return p1

    .line 33
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v0, "Required value was null."

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method


# virtual methods
.method protected final A()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->g:Landroid/view/inputmethod/InputMethodManager;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final B()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/textinput/j;->l:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/facebook/react/views/textinput/j;->l:I

    .line 6
    .line 7
    return v0
.end method

.method public final C()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x20000

    .line 6
    .line 7
    and-int/2addr v0, v1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method protected final E()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public final H(III)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/textinput/j;->v(I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/facebook/react/views/textinput/j;->G(II)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final J(Lcom/facebook/react/views/text/i;)V
    .locals 1

    .line 1
    const-string v0, "reactTextUpdate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->i:Z

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/facebook/react/views/textinput/j;->I(Lcom/facebook/react/views/text/i;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->i:Z

    .line 14
    .line 15
    return-void
.end method

.method public final K(Lcom/facebook/react/views/text/i;)V
    .locals 1

    .line 1
    const-string v0, "reactTextUpdate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->n0:Z

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/facebook/react/views/textinput/j;->I(Lcom/facebook/react/views/text/i;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->n0:Z

    .line 14
    .line 15
    return-void
.end method

.method public final L()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->z:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->z:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, Lcom/facebook/react/views/textinput/j;->C:I

    .line 14
    .line 15
    iget v3, p0, Lcom/facebook/react/views/textinput/j;->B:I

    .line 16
    .line 17
    iget-object v4, p0, Lcom/facebook/react/views/textinput/j;->A:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-virtual {v5}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    const-string v6, "getAssets(...)"

    .line 28
    .line 29
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v2, v3, v4, v5}, Lcom/facebook/react/views/text/p;->a(Landroid/graphics/Typeface;IILjava/lang/String;Landroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 37
    .line 38
    .line 39
    iget v1, p0, Lcom/facebook/react/views/textinput/j;->C:I

    .line 40
    .line 41
    const/4 v2, -0x1

    .line 42
    if-ne v1, v2, :cond_1

    .line 43
    .line 44
    iget v1, p0, Lcom/facebook/react/views/textinput/j;->B:I

    .line 45
    .line 46
    if-ne v1, v2, :cond_1

    .line 47
    .line 48
    iget-object v1, p0, Lcom/facebook/react/views/textinput/j;->A:Ljava/lang/String;

    .line 49
    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/widget/TextView;->getFontFeatureSettings()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    :cond_1
    const/4 v0, 0x1

    .line 59
    :cond_2
    if-eqz v0, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaintFlags()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    or-int/lit16 v1, v1, 0x80

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaintFlags()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    and-int/lit16 v1, v1, -0x81

    .line 73
    .line 74
    :goto_0
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setPaintFlags(I)V

    .line 75
    .line 76
    .line 77
    invoke-static {}, Lh7/b;->g()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaintFlags()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    or-int/lit8 v0, v0, 0x40

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaintFlags()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    and-int/lit8 v0, v0, -0x41

    .line 97
    .line 98
    :goto_1
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setPaintFlags(I)V

    .line 99
    .line 100
    .line 101
    :cond_5
    :goto_2
    return-void
.end method

.method public final N()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->O()Z

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final P(FI)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, Lcom/facebook/react/uimanager/t;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    sget-object v1, Lcom/facebook/react/uimanager/u;->a:Lcom/facebook/react/uimanager/u;

    .line 16
    .line 17
    invoke-direct {v0, p1, v1}, Lcom/facebook/react/uimanager/t;-><init>(FLcom/facebook/react/uimanager/u;)V

    .line 18
    .line 19
    .line 20
    move-object p1, v0

    .line 21
    :goto_0
    invoke-static {}, LH7/i;->b()Lkotlin/enums/EnumEntries;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, LH7/i;

    .line 30
    .line 31
    invoke-static {p0, p2, p1}, Lcom/facebook/react/uimanager/a;->s(Landroid/view/View;LH7/i;Lcom/facebook/react/uimanager/t;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final R()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->p:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->C()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0

    .line 15
    :cond_1
    const-string v1, "blurAndSubmit"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0
.end method

.method public final S()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->p:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->C()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return v2

    .line 14
    :cond_0
    return v1

    .line 15
    :cond_1
    const-string v3, "submit"

    .line 16
    .line 17
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_3

    .line 22
    .line 23
    const-string v3, "blurAndSubmit"

    .line 24
    .line 25
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    return v1

    .line 33
    :cond_3
    :goto_0
    return v2
.end method

.method protected final T()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->g:Landroid/view/inputmethod/InputMethodManager;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public addTextChangedListener(Landroid/text/TextWatcher;)V
    .locals 1

    .line 1
    const-string v0, "watcher"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/facebook/react/views/textinput/j;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->getTextWatcherDelegator()Lcom/facebook/react/views/textinput/j$c;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-super {p0, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method protected final finalize()V
    .locals 4

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/textinput/j;->s0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->h:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v3, "finalize["

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, "] delete cached spannable"

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v0, v1}, Lz5/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    sget-object v0, Lcom/facebook/react/views/text/s;->a:Lcom/facebook/react/views/text/s;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {v0, v1}, Lcom/facebook/react/views/text/s;->l(I)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method protected final getContainsImages()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getDisableFullscreenUI()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->r:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getDisableTextDiffing$ReactAndroid_release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->m0:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getDragAndDropFilter()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->q:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGravityHorizontal$ReactAndroid_release()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getGravity()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x800007

    .line 6
    .line 7
    .line 8
    and-int/2addr v0, v1

    .line 9
    return v0
.end method

.method public final getGravityVertical$ReactAndroid_release()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getGravity()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v0, v0, 0x70

    .line 6
    .line 7
    return v0
.end method

.method protected final getNativeEventCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/textinput/j;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public final getReturnKeyType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->q0:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStagedInputType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/textinput/j;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public final getStateWrapper()Lcom/facebook/react/uimanager/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->l0:Lcom/facebook/react/uimanager/a0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSubmitBehavior()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->p:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 1
    const-string v0, "drawable"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->o:Z

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const-class v2, LP7/r;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, [LP7/r;

    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, LP7/r;

    .line 44
    .line 45
    invoke-virtual {v1}, LP7/r;->a()Landroid/graphics/drawable/Drawable;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-ne v1, p1, :cond_0

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v0, "Required value was null."

    .line 58
    .line 59
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public isLayoutRequested()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public onAttachedToWindow()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionStart()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-super {p0, v2}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0, v1}, Lcom/facebook/react/views/textinput/j;->G(II)V

    .line 17
    .line 18
    .line 19
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->o:Z

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const-class v3, LP7/r;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-interface {v0, v4, v1, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, [LP7/r;

    .line 41
    .line 42
    invoke-static {v0}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, LP7/r;

    .line 57
    .line 58
    invoke-virtual {v1}, LP7/r;->c()V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v1, "Required value was null."

    .line 65
    .line 66
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->D:Z

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->F:Z

    .line 75
    .line 76
    if-nez v0, :cond_2

    .line 77
    .line 78
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->O()Z

    .line 79
    .line 80
    .line 81
    :cond_2
    iput-boolean v2, p0, Lcom/facebook/react/views/textinput/j;->F:Z

    .line 82
    .line 83
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    const-string v0, "newConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lh7/i;->a()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lh7/b;->n()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->u()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 4

    .line 1
    const-string v0, "outAttrs"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/facebook/react/uimanager/f0;->d(Landroid/view/View;)Lcom/facebook/react/bridge/ReactContext;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-super {p0, p1}, Landroidx/appcompat/widget/l;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-boolean v2, p0, Lcom/facebook/react/views/textinput/j;->x:Z

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    new-instance v2, Lcom/facebook/react/views/textinput/k;

    .line 21
    .line 22
    iget-object v3, p0, Lcom/facebook/react/views/textinput/j;->o0:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    invoke-direct {v2, v1, v0, p0, v3}, Lcom/facebook/react/views/textinput/k;-><init>(Landroid/view/inputmethod/InputConnection;Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    .line 27
    .line 28
    .line 29
    move-object v1, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v0, "Required value was null."

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->C()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->R()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->S()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    :cond_2
    iget v0, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 58
    .line 59
    const v2, -0x40000001    # -1.9999999f

    .line 60
    .line 61
    .line 62
    and-int/2addr v0, v2

    .line 63
    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 64
    .line 65
    :cond_3
    return-object v1
.end method

.method public onDetachedFromWindow()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroidx/appcompat/widget/l;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->o:Z

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-class v2, LP7/r;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, [LP7/r;

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, LP7/r;

    .line 42
    .line 43
    invoke-virtual {v1}, LP7/r;->d()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v1, "Required value was null."

    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0

    .line 55
    :cond_1
    return-void
.end method

.method public onDragEvent(Landroid/view/DragEvent;)Z
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->q:Ljava/util/List;

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/DragEvent;->getAction()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x1

    .line 15
    if-ne v1, v2, :cond_3

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/DragEvent;->getClipDescription()Landroid/content/ClipDescription;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2, v1}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 52
    return p1

    .line 53
    :cond_3
    :goto_1
    invoke-super {p0, p1}, Landroidx/appcompat/widget/l;->onDragEvent(Landroid/view/DragEvent;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    return p1
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->I:LH7/v;

    .line 7
    .line 8
    sget-object v1, LH7/v;->b:LH7/v;

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/a;->a(Landroid/view/View;Landroid/graphics/Canvas;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public onFinishTemporaryDetach()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/view/View;->onFinishTemporaryDetach()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->o:Z

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-class v2, LP7/r;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, [LP7/r;

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, LP7/r;

    .line 42
    .line 43
    invoke-virtual {v1}, LP7/r;->e()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v1, "Required value was null."

    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0

    .line 55
    :cond_1
    return-void
.end method

.method protected onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/facebook/react/views/textinput/j;->s:Lcom/facebook/react/views/textinput/L;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionStart()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    invoke-interface {p1, p2, p3}, Lcom/facebook/react/views/textinput/L;->a(II)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x42

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->C()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->A()V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->M()V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->G:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/widget/EditText;->selectAll()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->G:Z

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method protected onScrollChanged(IIII)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onScrollChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->u:Lcom/facebook/react/views/textinput/K;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0, p1, p2, p3, p4}, Lcom/facebook/react/views/textinput/K;->a(IIII)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method protected onSelectionChanged(II)V
    .locals 4

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/textinput/j;->s0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->h:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v3, "onSelectionChanged["

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, "]: "

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, " "

    .line 33
    .line 34
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v0, v1}, Lz5/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onSelectionChanged(II)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->s:Lcom/facebook/react/views/textinput/L;

    .line 51
    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->s:Lcom/facebook/react/views/textinput/L;

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    invoke-interface {v0, p1, p2}, Lcom/facebook/react/views/textinput/L;->a(II)V

    .line 65
    .line 66
    .line 67
    :cond_1
    return-void
.end method

.method public onStartTemporaryDetach()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/view/View;->onStartTemporaryDetach()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->o:Z

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-class v2, LP7/r;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, [LP7/r;

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, LP7/r;

    .line 42
    .line 43
    invoke-virtual {v1}, LP7/r;->f()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v1, "Required value was null."

    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0

    .line 55
    :cond_1
    return-void
.end method

.method public onTextContextMenuItem(I)Z
    .locals 1

    .line 1
    const v0, 0x1020022

    .line 2
    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    const p1, 0x1020031

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-super {p0, p1}, Landroidx/appcompat/widget/l;->onTextContextMenuItem(I)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    const-string v0, "ev"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    if-eq v0, v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->w:Z

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    const/4 v0, -0x1

    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->canScrollVertically(I)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x0

    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0, v1}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 52
    .line 53
    .line 54
    :cond_1
    iput-boolean v3, p0, Lcom/facebook/react/views/textinput/j;->w:Z

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    iput-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->w:Z

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 64
    .line 65
    .line 66
    :cond_3
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    return p1
.end method

.method public removeTextChangedListener(Landroid/text/TextWatcher;)V
    .locals 1

    .line 1
    const-string v0, "watcher"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->getTextWatcherDelegator()Lcom/facebook/react/views/textinput/j$c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-super {p0, p1}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final setAllowFontScaling(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->y:Lcom/facebook/react/views/text/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/views/text/r;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->y:Lcom/facebook/react/views/text/r;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/r;->h(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->u()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final setAutoFocus(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->D:Z

    .line 2
    .line 3
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/a;->m(Landroid/view/View;Ljava/lang/Integer;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setBorderRadius(F)V
    .locals 1

    .line 1
    sget-object v0, LH7/i;->a:LH7/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/views/textinput/j;->P(FI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setBorderStyle(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    sget-object v0, LH7/k;->a:LH7/k$a;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, LH7/k$a;->a(Ljava/lang/String;)LH7/k;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :goto_0
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/a;->t(Landroid/view/View;LH7/k;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method protected final setContainsImages(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->o:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setContentSizeWatcher(Lcom/facebook/react/views/textinput/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->t:Lcom/facebook/react/views/textinput/a;

    .line 2
    .line 3
    return-void
.end method

.method public final setContextMenuHidden(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->E:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setDisableFullscreenUI(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->r:Z

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->e0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setDisableTextDiffing$ReactAndroid_release(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->m0:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setDragAndDropFilter(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->q:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setEventDispatcher(Lcom/facebook/react/uimanager/events/EventDispatcher;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->o0:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    return-void
.end method

.method public final setFontFamily(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->A:Ljava/lang/String;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->z:Z

    .line 5
    .line 6
    return-void
.end method

.method public setFontFeatureSettings(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getFontFeatureSettings()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-super {p0, p1}, Landroid/widget/TextView;->setFontFeatureSettings(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->z:Z

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final setFontSize(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->y:Lcom/facebook/react/views/text/r;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/r;->i(F)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->u()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setFontStyle(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/facebook/react/views/text/p;->b(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget v0, p0, Lcom/facebook/react/views/textinput/j;->C:I

    .line 6
    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    iput p1, p0, Lcom/facebook/react/views/textinput/j;->C:I

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->z:Z

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final setFontWeight(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/facebook/react/views/text/p;->d(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget v0, p0, Lcom/facebook/react/views/textinput/j;->B:I

    .line 6
    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    iput p1, p0, Lcom/facebook/react/views/textinput/j;->B:I

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->z:Z

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final setGravityHorizontal$ReactAndroid_release(I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget p1, p0, Lcom/facebook/react/views/textinput/j;->j:I

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getGravity()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const v1, -0x800008

    .line 10
    .line 11
    .line 12
    and-int/2addr v0, v1

    .line 13
    or-int/2addr p1, v0

    .line 14
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final setGravityVertical$ReactAndroid_release(I)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget p1, p0, Lcom/facebook/react/views/textinput/j;->k:I

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getGravity()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    and-int/lit8 v0, v0, -0x71

    .line 10
    .line 11
    or-int/2addr p1, v0

    .line 12
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setInputType(I)V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-super {p0, p1}, Landroid/widget/TextView;->setInputType(I)V

    .line 6
    .line 7
    .line 8
    iput p1, p0, Lcom/facebook/react/views/textinput/j;->n:I

    .line 9
    .line 10
    invoke-super {p0, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->C()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->v:Lcom/facebook/react/views/textinput/j$b;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    new-instance v0, Lcom/facebook/react/views/textinput/j$b;

    .line 28
    .line 29
    invoke-direct {v0}, Lcom/facebook/react/views/textinput/j$b;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/facebook/react/views/textinput/j;->v:Lcom/facebook/react/views/textinput/j$b;

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->v:Lcom/facebook/react/views/textinput/j$b;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/textinput/j$b;->a(I)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iget-object p1, p0, Lcom/facebook/react/views/textinput/j;->v:Lcom/facebook/react/views/textinput/j$b;

    .line 42
    .line 43
    invoke-super {p0, p1}, Landroidx/appcompat/widget/l;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final setLetterSpacingPt(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->y:Lcom/facebook/react/views/text/r;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/r;->k(F)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->u()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setLineHeight(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->y:Lcom/facebook/react/views/text/r;

    .line 2
    .line 3
    int-to-float p1, p1

    .line 4
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/r;->l(F)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final setMaxFontSizeMultiplier(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->y:Lcom/facebook/react/views/text/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/views/text/r;->g()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    cmpg-float v0, p1, v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->y:Lcom/facebook/react/views/text/r;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/r;->m(F)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->u()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method protected final setNativeEventCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/textinput/j;->l:I

    .line 2
    .line 3
    return-void
.end method

.method public final setOnKeyPress(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->x:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setOverflow(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, LH7/v;->b:LH7/v;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->I:LH7/v;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, LH7/v;->a:LH7/v$a;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, LH7/v$a;->a(Ljava/lang/String;)LH7/v;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    sget-object p1, LH7/v;->b:LH7/v;

    .line 17
    .line 18
    :cond_1
    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->I:LH7/v;

    .line 19
    .line 20
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final setPlaceholder(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->H:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->H:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final setReturnKeyType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->q0:Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->e0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setScrollWatcher(Lcom/facebook/react/views/textinput/K;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->u:Lcom/facebook/react/views/textinput/K;

    .line 2
    .line 3
    return-void
.end method

.method public final setSelectTextOnFocus(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/TextView;->setSelectAllOnFocus(Z)V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->G:Z

    .line 5
    .line 6
    return-void
.end method

.method public setSelection(II)V
    .locals 4

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/textinput/j;->s0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->h:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v3, "setSelection["

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, "]: "

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, " "

    .line 33
    .line 34
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v0, v1}, Lz5/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/EditText;->setSelection(II)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final setSelectionWatcher$ReactAndroid_release(Lcom/facebook/react/views/textinput/L;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->s:Lcom/facebook/react/views/textinput/L;

    .line 2
    .line 3
    return-void
.end method

.method protected final setSettingTextFromJS(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->i:Z

    .line 2
    .line 3
    return-void
.end method

.method protected final setSettingTextFromState(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->n0:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setStagedInputType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/textinput/j;->n:I

    .line 2
    .line 3
    return-void
.end method

.method public final setStateWrapper(Lcom/facebook/react/uimanager/a0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->l0:Lcom/facebook/react/uimanager/a0;

    .line 2
    .line 3
    return-void
.end method

.method public final setSubmitBehavior(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->p:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method protected final u()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->y:Lcom/facebook/react/views/text/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/views/text/r;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p0, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->y:Lcom/facebook/react/views/text/r;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/facebook/react/views/text/r;->d()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final v(I)Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/textinput/j;->l:I

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    return p1
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 4

    .line 1
    const-string v0, "drawable"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->o:Z

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const-class v2, LP7/r;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, [LP7/r;

    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, LP7/r;

    .line 44
    .line 45
    invoke-virtual {v1}, LP7/r;->a()Landroid/graphics/drawable/Drawable;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-ne v1, p1, :cond_0

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    return p1

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v0, "Required value was null."

    .line 56
    .line 57
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    return p1
.end method

.method public final x()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-gt v0, v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    check-cast v0, Landroid/view/ViewGroup;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/high16 v2, 0x60000

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 32
    .line 33
    .line 34
    invoke-super {p0}, Landroid/view/View;->clearFocus()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    invoke-super {p0}, Landroid/view/View;->clearFocus()V

    .line 42
    .line 43
    .line 44
    :goto_1
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->A()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final y()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->x()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final z()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/facebook/react/views/textinput/j;->n:I

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionStart()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget v2, p0, Lcom/facebook/react/views/textinput/j;->n:I

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lcom/facebook/react/views/textinput/j;->setInputType(I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0, v1}, Lcom/facebook/react/views/textinput/j;->G(II)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method
