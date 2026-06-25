.class public final Lcom/facebook/react/views/textinput/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/views/textinput/a;


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
    iput-object p1, p0, Lcom/facebook/react/views/textinput/m;->a:Lcom/facebook/react/views/textinput/j;

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
    iput-object p1, p0, Lcom/facebook/react/views/textinput/m;->b:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/facebook/react/uimanager/f0;->e(Landroid/content/Context;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput p1, p0, Lcom/facebook/react/views/textinput/m;->c:I

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/m;->a:Lcom/facebook/react/views/textinput/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/facebook/react/views/textinput/m;->a:Lcom/facebook/react/views/textinput/j;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Lcom/facebook/react/views/textinput/m;->a:Lcom/facebook/react/views/textinput/j;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/facebook/react/views/textinput/m;->a:Lcom/facebook/react/views/textinput/j;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundPaddingLeft()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, Lcom/facebook/react/views/textinput/m;->a:Lcom/facebook/react/views/textinput/j;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Landroid/text/Layout;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/2addr v0, v1

    .line 38
    iget-object v1, p0, Lcom/facebook/react/views/textinput/m;->a:Lcom/facebook/react/views/textinput/j;

    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/widget/TextView;->getCompoundPaddingRight()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    add-int/2addr v0, v1

    .line 45
    iget-object v1, p0, Lcom/facebook/react/views/textinput/m;->a:Lcom/facebook/react/views/textinput/j;

    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    iget-object v2, p0, Lcom/facebook/react/views/textinput/m;->a:Lcom/facebook/react/views/textinput/j;

    .line 52
    .line 53
    invoke-virtual {v2}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2}, Landroid/text/Layout;->getHeight()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    add-int/2addr v1, v2

    .line 62
    iget-object v2, p0, Lcom/facebook/react/views/textinput/m;->a:Lcom/facebook/react/views/textinput/j;

    .line 63
    .line 64
    invoke-virtual {v2}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    add-int/2addr v1, v2

    .line 69
    :cond_0
    iget v2, p0, Lcom/facebook/react/views/textinput/m;->d:I

    .line 70
    .line 71
    if-ne v0, v2, :cond_1

    .line 72
    .line 73
    iget v2, p0, Lcom/facebook/react/views/textinput/m;->e:I

    .line 74
    .line 75
    if-eq v1, v2, :cond_2

    .line 76
    .line 77
    :cond_1
    iput v1, p0, Lcom/facebook/react/views/textinput/m;->e:I

    .line 78
    .line 79
    iput v0, p0, Lcom/facebook/react/views/textinput/m;->d:I

    .line 80
    .line 81
    iget-object v2, p0, Lcom/facebook/react/views/textinput/m;->b:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 82
    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    new-instance v3, Lcom/facebook/react/views/textinput/b;

    .line 86
    .line 87
    iget v4, p0, Lcom/facebook/react/views/textinput/m;->c:I

    .line 88
    .line 89
    iget-object v5, p0, Lcom/facebook/react/views/textinput/m;->a:Lcom/facebook/react/views/textinput/j;

    .line 90
    .line 91
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    int-to-float v0, v0

    .line 96
    invoke-static {v0}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    int-to-float v1, v1

    .line 101
    invoke-static {v1}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    invoke-direct {v3, v4, v5, v0, v1}, Lcom/facebook/react/views/textinput/b;-><init>(IIFF)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v2, v3}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 109
    .line 110
    .line 111
    :cond_2
    return-void
.end method
