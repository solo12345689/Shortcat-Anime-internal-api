.class Lcom/facebook/react/views/scroll/j$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/scroll/j;->x(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private a:Z

.field private b:I

.field final synthetic c:Lcom/facebook/react/views/scroll/j;


# direct methods
.method constructor <init>(Lcom/facebook/react/views/scroll/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/scroll/j$b;->c:Lcom/facebook/react/views/scroll/j;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/j$b;->a:Z

    .line 8
    .line 9
    iput p1, p0, Lcom/facebook/react/views/scroll/j$b;->b:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j$b;->c:Lcom/facebook/react/views/scroll/j;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/views/scroll/j;->e(Lcom/facebook/react/views/scroll/j;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide/16 v1, 0x14

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j$b;->c:Lcom/facebook/react/views/scroll/j;

    .line 13
    .line 14
    invoke-static {v0, v3}, Lcom/facebook/react/views/scroll/j;->h(Lcom/facebook/react/views/scroll/j;Z)V

    .line 15
    .line 16
    .line 17
    iput v3, p0, Lcom/facebook/react/views/scroll/j$b;->b:I

    .line 18
    .line 19
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j$b;->c:Lcom/facebook/react/views/scroll/j;

    .line 20
    .line 21
    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j$b;->c:Lcom/facebook/react/views/scroll/j;

    .line 26
    .line 27
    invoke-static {v0}, Lcom/facebook/react/views/scroll/n;->z(Landroid/view/ViewGroup;)V

    .line 28
    .line 29
    .line 30
    iget v0, p0, Lcom/facebook/react/views/scroll/j$b;->b:I

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    add-int/2addr v0, v4

    .line 34
    iput v0, p0, Lcom/facebook/react/views/scroll/j$b;->b:I

    .line 35
    .line 36
    const/4 v5, 0x3

    .line 37
    if-lt v0, v5, :cond_2

    .line 38
    .line 39
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j$b;->c:Lcom/facebook/react/views/scroll/j;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-static {v0, v1}, Lcom/facebook/react/views/scroll/j;->i(Lcom/facebook/react/views/scroll/j;Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j$b;->c:Lcom/facebook/react/views/scroll/j;

    .line 46
    .line 47
    invoke-static {v0}, Lcom/facebook/react/views/scroll/j;->g(Lcom/facebook/react/views/scroll/j;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j$b;->c:Lcom/facebook/react/views/scroll/j;

    .line 54
    .line 55
    invoke-static {v0}, Lcom/facebook/react/views/scroll/n;->l(Landroid/view/ViewGroup;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j$b;->c:Lcom/facebook/react/views/scroll/j;

    .line 59
    .line 60
    invoke-static {v0}, Lcom/facebook/react/views/scroll/n;->r(Landroid/view/ViewGroup;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j$b;->c:Lcom/facebook/react/views/scroll/j;

    .line 65
    .line 66
    invoke-static {v0}, Lcom/facebook/react/views/scroll/j;->f(Lcom/facebook/react/views/scroll/j;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/j$b;->a:Z

    .line 73
    .line 74
    if-nez v0, :cond_3

    .line 75
    .line 76
    iput-boolean v4, p0, Lcom/facebook/react/views/scroll/j$b;->a:Z

    .line 77
    .line 78
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j$b;->c:Lcom/facebook/react/views/scroll/j;

    .line 79
    .line 80
    invoke-static {v0, v3}, Lcom/facebook/react/views/scroll/j;->j(Lcom/facebook/react/views/scroll/j;I)V

    .line 81
    .line 82
    .line 83
    :cond_3
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j$b;->c:Lcom/facebook/react/views/scroll/j;

    .line 84
    .line 85
    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 86
    .line 87
    .line 88
    return-void
.end method
