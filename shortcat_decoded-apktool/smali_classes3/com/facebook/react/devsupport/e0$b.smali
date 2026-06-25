.class final Lcom/facebook/react/devsupport/e0$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private a:Z

.field private b:I

.field private c:I

.field final synthetic d:Lcom/facebook/react/devsupport/e0;


# direct methods
.method public constructor <init>(Lcom/facebook/react/devsupport/e0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/e0$b;->d:Lcom/facebook/react/devsupport/e0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/facebook/react/devsupport/e0$b;->a:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/devsupport/e0$b;->d:Lcom/facebook/react/devsupport/e0;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/facebook/react/devsupport/e0$b;->a:Z

    .line 3
    .line 4
    return-void
.end method

.method public run()V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/e0$b;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Lcom/facebook/react/devsupport/e0$b;->b:I

    .line 7
    .line 8
    iget-object v1, p0, Lcom/facebook/react/devsupport/e0$b;->d:Lcom/facebook/react/devsupport/e0;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/facebook/react/devsupport/e0;->a(Lcom/facebook/react/devsupport/e0;)Lcom/facebook/react/modules/debug/h;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lcom/facebook/react/modules/debug/h;->d()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, Lcom/facebook/react/devsupport/e0$b;->d:Lcom/facebook/react/devsupport/e0;

    .line 19
    .line 20
    invoke-static {v2}, Lcom/facebook/react/devsupport/e0;->a(Lcom/facebook/react/devsupport/e0;)Lcom/facebook/react/modules/debug/h;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Lcom/facebook/react/modules/debug/h;->g()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    sub-int/2addr v1, v2

    .line 29
    add-int/2addr v0, v1

    .line 30
    iput v0, p0, Lcom/facebook/react/devsupport/e0$b;->b:I

    .line 31
    .line 32
    iget v0, p0, Lcom/facebook/react/devsupport/e0$b;->c:I

    .line 33
    .line 34
    iget-object v1, p0, Lcom/facebook/react/devsupport/e0$b;->d:Lcom/facebook/react/devsupport/e0;

    .line 35
    .line 36
    invoke-static {v1}, Lcom/facebook/react/devsupport/e0;->a(Lcom/facebook/react/devsupport/e0;)Lcom/facebook/react/modules/debug/h;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Lcom/facebook/react/modules/debug/h;->c()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    add-int/2addr v0, v1

    .line 45
    iput v0, p0, Lcom/facebook/react/devsupport/e0$b;->c:I

    .line 46
    .line 47
    iget-object v1, p0, Lcom/facebook/react/devsupport/e0$b;->d:Lcom/facebook/react/devsupport/e0;

    .line 48
    .line 49
    invoke-static {v1}, Lcom/facebook/react/devsupport/e0;->a(Lcom/facebook/react/devsupport/e0;)Lcom/facebook/react/modules/debug/h;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lcom/facebook/react/modules/debug/h;->e()D

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    iget-object v0, p0, Lcom/facebook/react/devsupport/e0$b;->d:Lcom/facebook/react/devsupport/e0;

    .line 58
    .line 59
    invoke-static {v0}, Lcom/facebook/react/devsupport/e0;->a(Lcom/facebook/react/devsupport/e0;)Lcom/facebook/react/modules/debug/h;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Lcom/facebook/react/modules/debug/h;->f()D

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    iget v6, p0, Lcom/facebook/react/devsupport/e0$b;->b:I

    .line 68
    .line 69
    iget v7, p0, Lcom/facebook/react/devsupport/e0$b;->c:I

    .line 70
    .line 71
    iget-object v0, p0, Lcom/facebook/react/devsupport/e0$b;->d:Lcom/facebook/react/devsupport/e0;

    .line 72
    .line 73
    invoke-static {v0}, Lcom/facebook/react/devsupport/e0;->a(Lcom/facebook/react/devsupport/e0;)Lcom/facebook/react/modules/debug/h;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lcom/facebook/react/modules/debug/h;->j()Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    invoke-static/range {v1 .. v8}, Lcom/facebook/react/devsupport/e0;->b(Lcom/facebook/react/devsupport/e0;DDIIZ)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lcom/facebook/react/devsupport/e0$b;->d:Lcom/facebook/react/devsupport/e0;

    .line 85
    .line 86
    invoke-static {v0}, Lcom/facebook/react/devsupport/e0;->a(Lcom/facebook/react/devsupport/e0;)Lcom/facebook/react/modules/debug/h;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Lcom/facebook/react/modules/debug/h;->k()V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lcom/facebook/react/devsupport/e0$b;->d:Lcom/facebook/react/devsupport/e0;

    .line 94
    .line 95
    const-wide/16 v1, 0x1f4

    .line 96
    .line 97
    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 98
    .line 99
    .line 100
    return-void
.end method
