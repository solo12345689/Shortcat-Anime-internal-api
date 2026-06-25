.class public final Lcom/facebook/react/views/textinput/J;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/views/textinput/L;


# instance fields
.field private final a:Lcom/facebook/react/views/textinput/j;

.field private final b:Lcom/facebook/react/uimanager/events/EventDispatcher;

.field private final c:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Lcom/facebook/react/views/textinput/j;)V
    .locals 1

    .line 1
    const-string v0, "editText"

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
    iput-object p1, p0, Lcom/facebook/react/views/textinput/J;->a:Lcom/facebook/react/views/textinput/j;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/facebook/react/uimanager/f0;->d(Landroid/view/View;)Lcom/facebook/react/bridge/ReactContext;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/f0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lcom/facebook/react/views/textinput/J;->b:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/facebook/react/uimanager/f0;->e(Landroid/content/Context;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput p1, p0, Lcom/facebook/react/views/textinput/J;->c:I

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 4

    .line 1
    int-to-double v0, p1

    .line 2
    int-to-double p1, p2

    .line 3
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(DD)D

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    double-to-int v2, v2

    .line 8
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(DD)D

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    double-to-int p1, p1

    .line 13
    iget p2, p0, Lcom/facebook/react/views/textinput/J;->d:I

    .line 14
    .line 15
    if-ne p2, v2, :cond_1

    .line 16
    .line 17
    iget p2, p0, Lcom/facebook/react/views/textinput/J;->e:I

    .line 18
    .line 19
    if-eq p2, p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void

    .line 23
    :cond_1
    :goto_0
    iget-object p2, p0, Lcom/facebook/react/views/textinput/J;->b:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 24
    .line 25
    if-eqz p2, :cond_2

    .line 26
    .line 27
    new-instance v0, Lcom/facebook/react/views/textinput/E;

    .line 28
    .line 29
    iget v1, p0, Lcom/facebook/react/views/textinput/J;->c:I

    .line 30
    .line 31
    iget-object v3, p0, Lcom/facebook/react/views/textinput/J;->a:Lcom/facebook/react/views/textinput/j;

    .line 32
    .line 33
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-direct {v0, v1, v3, v2, p1}, Lcom/facebook/react/views/textinput/E;-><init>(IIII)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p2, v0}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    iput v2, p0, Lcom/facebook/react/views/textinput/J;->d:I

    .line 44
    .line 45
    iput p1, p0, Lcom/facebook/react/views/textinput/J;->e:I

    .line 46
    .line 47
    return-void
.end method
