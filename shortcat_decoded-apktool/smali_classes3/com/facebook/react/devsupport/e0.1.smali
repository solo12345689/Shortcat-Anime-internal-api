.class public final Lcom/facebook/react/devsupport/e0;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/e0$a;,
        Lcom/facebook/react/devsupport/e0$b;
    }
.end annotation


# static fields
.field public static final d:Lcom/facebook/react/devsupport/e0$a;


# instance fields
.field private final a:Landroid/widget/TextView;

.field private final b:Lcom/facebook/react/modules/debug/h;

.field private final c:Lcom/facebook/react/devsupport/e0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/e0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/e0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/devsupport/e0;->d:Lcom/facebook/react/devsupport/e0$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 9

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    sget v0, Lcom/facebook/react/n;->c:I

    .line 8
    .line 9
    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    sget v0, Lcom/facebook/react/l;->p:I

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "null cannot be cast to non-null type android.widget.TextView"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    check-cast v0, Landroid/widget/TextView;

    .line 24
    .line 25
    iput-object v0, p0, Lcom/facebook/react/devsupport/e0;->a:Landroid/widget/TextView;

    .line 26
    .line 27
    new-instance v0, Lcom/facebook/react/modules/debug/h;

    .line 28
    .line 29
    invoke-direct {v0, p1}, Lcom/facebook/react/modules/debug/h;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/facebook/react/devsupport/e0;->b:Lcom/facebook/react/modules/debug/h;

    .line 33
    .line 34
    new-instance p1, Lcom/facebook/react/devsupport/e0$b;

    .line 35
    .line 36
    invoke-direct {p1, p0}, Lcom/facebook/react/devsupport/e0$b;-><init>(Lcom/facebook/react/devsupport/e0;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lcom/facebook/react/devsupport/e0;->c:Lcom/facebook/react/devsupport/e0$b;

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    invoke-virtual {v0}, Lcom/facebook/react/modules/debug/h;->j()Z

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    const-wide/16 v2, 0x0

    .line 47
    .line 48
    const-wide/16 v4, 0x0

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    move-object v1, p0

    .line 52
    invoke-direct/range {v1 .. v8}, Lcom/facebook/react/devsupport/e0;->c(DDIIZ)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public static final synthetic a(Lcom/facebook/react/devsupport/e0;)Lcom/facebook/react/modules/debug/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/e0;->b:Lcom/facebook/react/modules/debug/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/facebook/react/devsupport/e0;DDIIZ)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lcom/facebook/react/devsupport/e0;->c(DDIIZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final c(DDIIZ)V
    .locals 1

    .line 1
    sget-object v0, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    .line 2
    .line 3
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p5

    .line 17
    filled-new-array {p1, p2, p5}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 p2, 0x3

    .line 22
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string p2, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far"

    .line 27
    .line 28
    invoke-static {v0, p2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string p2, "format(...)"

    .line 33
    .line 34
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    if-nez p7, :cond_0

    .line 38
    .line 39
    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    const/4 p4, 0x1

    .line 48
    invoke-static {p3, p4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    const-string p4, "\nJS: %.1f fps"

    .line 53
    .line 54
    invoke-static {v0, p4, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance p2, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :cond_0
    iget-object p2, p0, Lcom/facebook/react/devsupport/e0;->a:Landroid/widget/TextView;

    .line 77
    .line 78
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    .line 80
    .line 81
    const-string p2, "ReactNative"

    .line 82
    .line 83
    invoke-static {p2, p1}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method protected onAttachedToWindow()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/devsupport/e0;->b:Lcom/facebook/react/modules/debug/h;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/facebook/react/modules/debug/h;->k()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/react/devsupport/e0;->b:Lcom/facebook/react/modules/debug/h;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    const-wide/16 v3, 0x0

    .line 14
    .line 15
    invoke-static {v0, v3, v4, v1, v2}, Lcom/facebook/react/modules/debug/h;->m(Lcom/facebook/react/modules/debug/h;DILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/facebook/react/devsupport/e0;->c:Lcom/facebook/react/devsupport/e0$b;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/e0$b;->a()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/devsupport/e0;->b:Lcom/facebook/react/modules/debug/h;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/facebook/react/modules/debug/h;->o()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/react/devsupport/e0;->c:Lcom/facebook/react/devsupport/e0$b;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/e0$b;->b()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
