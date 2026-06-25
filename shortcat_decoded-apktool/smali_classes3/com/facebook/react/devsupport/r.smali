.class public final Lcom/facebook/react/devsupport/r;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lc7/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/r$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/facebook/react/devsupport/r$a;

.field private static e:Z


# instance fields
.field private final a:Lcom/facebook/react/devsupport/u0;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/PopupWindow;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/r$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/r$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/devsupport/r;->d:Lcom/facebook/react/devsupport/r$a;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    sput-boolean v0, Lcom/facebook/react/devsupport/r;->e:Z

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/devsupport/u0;)V
    .locals 1

    .line 1
    const-string v0, "reactInstanceDevHelper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/facebook/react/devsupport/r;->a:Lcom/facebook/react/devsupport/u0;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic e(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/facebook/react/devsupport/r;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/react/devsupport/r;->n(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/facebook/react/devsupport/r;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Lcom/facebook/react/devsupport/r;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/devsupport/r;->l(Lcom/facebook/react/devsupport/r;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lcom/facebook/react/devsupport/r;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/r;->i(Lcom/facebook/react/devsupport/r;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(Lcom/facebook/react/devsupport/r;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/react/devsupport/r;->m(Lcom/facebook/react/devsupport/r;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final i(Lcom/facebook/react/devsupport/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/r;->j()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final j()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/r;->c:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lcom/facebook/react/devsupport/r;->c:Landroid/widget/PopupWindow;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/facebook/react/devsupport/r;->b:Landroid/widget/TextView;

    .line 20
    .line 21
    :cond_1
    :goto_0
    return-void
.end method

.method private final k(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/r;->c:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/r;->a:Lcom/facebook/react/devsupport/u0;

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/facebook/react/devsupport/u0;->a()Landroid/app/Activity;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "ReactNative"

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const-string p1, "Unable to display loading message because react activity isn\'t available"

    .line 24
    .line 25
    invoke-static {v1, p1}, Lz5/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    :try_start_0
    new-instance v2, Landroid/graphics/Rect;

    .line 30
    .line 31
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 43
    .line 44
    .line 45
    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 46
    .line 47
    const-string v3, "layout_inflater"

    .line 48
    .line 49
    invoke-virtual {v0, v3}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    const-string v4, "null cannot be cast to non-null type android.view.LayoutInflater"

    .line 54
    .line 55
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    check-cast v3, Landroid/view/LayoutInflater;

    .line 59
    .line 60
    sget v4, Lcom/facebook/react/n;->b:I

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    invoke-virtual {v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const-string v4, "null cannot be cast to non-null type android.widget.TextView"

    .line 68
    .line 69
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    check-cast v3, Landroid/widget/TextView;

    .line 73
    .line 74
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    if-eqz p2, :cond_2

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 80
    .line 81
    .line 82
    move-result-wide v4

    .line 83
    double-to-int p2, v4

    .line 84
    invoke-virtual {v3, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 85
    .line 86
    .line 87
    :cond_2
    if-eqz p3, :cond_3

    .line 88
    .line 89
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 90
    .line 91
    .line 92
    move-result-wide p2

    .line 93
    double-to-int p2, p2

    .line 94
    invoke-virtual {v3, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 95
    .line 96
    .line 97
    :cond_3
    new-instance p2, Lcom/facebook/react/devsupport/q;

    .line 98
    .line 99
    invoke-direct {p2, p0}, Lcom/facebook/react/devsupport/q;-><init>(Lcom/facebook/react/devsupport/r;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    .line 104
    .line 105
    new-instance p2, Landroid/widget/PopupWindow;

    .line 106
    .line 107
    const/4 p3, -0x1

    .line 108
    const/4 v4, -0x2

    .line 109
    invoke-direct {p2, v3, p3, v4}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    invoke-virtual {p3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    const/4 v0, 0x0

    .line 121
    invoke-virtual {p2, p3, v0, v0, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 122
    .line 123
    .line 124
    iput-object v3, p0, Lcom/facebook/react/devsupport/r;->b:Landroid/widget/TextView;

    .line 125
    .line 126
    iput-object p2, p0, Lcom/facebook/react/devsupport/r;->c:Landroid/widget/PopupWindow;
    :try_end_0
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    .line 128
    return-void

    .line 129
    :catch_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    const-string p3, "Unable to display loading message because react activity isn\'t active, message: "

    .line 135
    .line 136
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {v1, p1}, Lz5/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method

.method private static final l(Lcom/facebook/react/devsupport/r;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/r;->j()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final m(Lcom/facebook/react/devsupport/r;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/devsupport/r;->k(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final n(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/facebook/react/devsupport/r;Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    .line 12
    .line 13
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    int-to-float p0, p0

    .line 22
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    int-to-float p1, p1

    .line 27
    div-float/2addr p0, p1

    .line 28
    const/16 p1, 0x64

    .line 29
    .line 30
    int-to-float p1, p1

    .line 31
    mul-float/2addr p0, p1

    .line 32
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const/4 p1, 0x1

    .line 41
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const-string p1, " %.1f%%"

    .line 46
    .line 47
    invoke-static {v0, p1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string p1, "format(...)"

    .line 52
    .line 53
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const-string p0, ""

    .line 58
    .line 59
    :goto_0
    iget-object p1, p2, Lcom/facebook/react/devsupport/r;->b:Landroid/widget/TextView;

    .line 60
    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    if-nez p3, :cond_1

    .line 64
    .line 65
    const-string p3, "Loading"

    .line 66
    .line 67
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string p0, "\u2026"

    .line 79
    .line 80
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/facebook/react/devsupport/r;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/facebook/react/devsupport/o;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/o;-><init>(Lcom/facebook/react/devsupport/r;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, p1, v0, v0}, Lcom/facebook/react/devsupport/r;->c(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V
    .locals 1

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-boolean v0, Lcom/facebook/react/devsupport/r;->e:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/n;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/facebook/react/devsupport/n;-><init>(Lcom/facebook/react/devsupport/r;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/facebook/react/devsupport/r;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/p;

    .line 7
    .line 8
    invoke-direct {v0, p2, p3, p0, p1}, Lcom/facebook/react/devsupport/p;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/facebook/react/devsupport/r;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method
