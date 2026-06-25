.class public final Lcom/facebook/react/views/switchview/d;
.super Lcom/facebook/react/uimanager/r;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/yoga/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/switchview/d$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/facebook/react/views/switchview/d$a;


# instance fields
.field private a:I

.field private b:I

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/switchview/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/switchview/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/switchview/d;->d:Lcom/facebook/react/views/switchview/d$a;

    .line 8
    .line 9
    const-string v0, "ReactSwitchShadowNode"

    .line 10
    .line 11
    sget-object v1, LW6/a;->b:LW6/a;

    .line 12
    .line 13
    invoke-static {v0, v1}, LW6/b;->a(Ljava/lang/String;LW6/a;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/r;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/facebook/react/views/switchview/d;->f()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final f()V
    .locals 0

    .line 1
    invoke-virtual {p0, p0}, Lcom/facebook/react/uimanager/P;->setMeasureFunction(Lcom/facebook/yoga/o;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public measure(Lcom/facebook/yoga/r;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)J
    .locals 0

    .line 1
    const-string p2, "node"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "widthMode"

    .line 7
    .line 8
    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "heightMode"

    .line 12
    .line 13
    invoke-static {p5, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-boolean p1, p0, Lcom/facebook/react/views/switchview/d;->c:Z

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    new-instance p1, Lcom/facebook/react/views/switchview/a;

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/P;->getThemedContext()Lcom/facebook/react/uimanager/b0;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    const-string p3, "getThemedContext(...)"

    .line 27
    .line 28
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p1, p2}, Lcom/facebook/react/views/switchview/a;-><init>(Landroid/content/Context;)V

    .line 32
    .line 33
    .line 34
    const/4 p2, 0x0

    .line 35
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/c0;->setShowText(Z)V

    .line 36
    .line 37
    .line 38
    invoke-static {p2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    invoke-virtual {p1, p2, p2}, Landroid/view/View;->measure(II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    iput p2, p0, Lcom/facebook/react/views/switchview/d;->a:I

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iput p1, p0, Lcom/facebook/react/views/switchview/d;->b:I

    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    iput-boolean p1, p0, Lcom/facebook/react/views/switchview/d;->c:Z

    .line 59
    .line 60
    :cond_0
    iget p1, p0, Lcom/facebook/react/views/switchview/d;->a:I

    .line 61
    .line 62
    iget p2, p0, Lcom/facebook/react/views/switchview/d;->b:I

    .line 63
    .line 64
    invoke-static {p1, p2}, Lcom/facebook/yoga/q;->b(II)J

    .line 65
    .line 66
    .line 67
    move-result-wide p1

    .line 68
    return-wide p1
.end method
