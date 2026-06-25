.class final Lcom/facebook/react/uimanager/j0$m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/uimanager/j0$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "m"
.end annotation


# instance fields
.field private final a:I

.field private final b:Lcom/facebook/react/bridge/Callback;

.field final synthetic c:Lcom/facebook/react/uimanager/j0;


# direct methods
.method private constructor <init>(Lcom/facebook/react/uimanager/j0;ILcom/facebook/react/bridge/Callback;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/facebook/react/uimanager/j0$m;->c:Lcom/facebook/react/uimanager/j0;

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p2, p0, Lcom/facebook/react/uimanager/j0$m;->a:I

    .line 5
    iput-object p3, p0, Lcom/facebook/react/uimanager/j0$m;->b:Lcom/facebook/react/bridge/Callback;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/uimanager/j0;ILcom/facebook/react/bridge/Callback;Lcom/facebook/react/uimanager/k0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/j0$m;-><init>(Lcom/facebook/react/uimanager/j0;ILcom/facebook/react/bridge/Callback;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    :try_start_0
    iget-object v2, p0, Lcom/facebook/react/uimanager/j0$m;->c:Lcom/facebook/react/uimanager/j0;

    .line 7
    .line 8
    invoke-static {v2}, Lcom/facebook/react/uimanager/j0;->d(Lcom/facebook/react/uimanager/j0;)Lcom/facebook/react/uimanager/y;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget v3, p0, Lcom/facebook/react/uimanager/j0$m;->a:I

    .line 13
    .line 14
    iget-object v4, p0, Lcom/facebook/react/uimanager/j0$m;->c:Lcom/facebook/react/uimanager/j0;

    .line 15
    .line 16
    invoke-static {v4}, Lcom/facebook/react/uimanager/j0;->c(Lcom/facebook/react/uimanager/j0;)[I

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v2, v3, v4}, Lcom/facebook/react/uimanager/y;->r(I[I)V
    :try_end_0
    .catch Lcom/facebook/react/uimanager/o; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Lcom/facebook/react/uimanager/j0$m;->c:Lcom/facebook/react/uimanager/j0;

    .line 24
    .line 25
    invoke-static {v2}, Lcom/facebook/react/uimanager/j0;->c(Lcom/facebook/react/uimanager/j0;)[I

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    aget v0, v2, v0

    .line 30
    .line 31
    int-to-float v0, v0

    .line 32
    invoke-static {v0}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, Lcom/facebook/react/uimanager/j0$m;->c:Lcom/facebook/react/uimanager/j0;

    .line 37
    .line 38
    invoke-static {v2}, Lcom/facebook/react/uimanager/j0;->c(Lcom/facebook/react/uimanager/j0;)[I

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const/4 v3, 0x1

    .line 43
    aget v2, v2, v3

    .line 44
    .line 45
    int-to-float v2, v2

    .line 46
    invoke-static {v2}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    iget-object v3, p0, Lcom/facebook/react/uimanager/j0$m;->c:Lcom/facebook/react/uimanager/j0;

    .line 51
    .line 52
    invoke-static {v3}, Lcom/facebook/react/uimanager/j0;->c(Lcom/facebook/react/uimanager/j0;)[I

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    const/4 v4, 0x2

    .line 57
    aget v3, v3, v4

    .line 58
    .line 59
    int-to-float v3, v3

    .line 60
    invoke-static {v3}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    iget-object v4, p0, Lcom/facebook/react/uimanager/j0$m;->c:Lcom/facebook/react/uimanager/j0;

    .line 65
    .line 66
    invoke-static {v4}, Lcom/facebook/react/uimanager/j0;->c(Lcom/facebook/react/uimanager/j0;)[I

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    const/4 v5, 0x3

    .line 71
    aget v4, v4, v5

    .line 72
    .line 73
    int-to-float v4, v4

    .line 74
    invoke-static {v4}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    iget-object v7, p0, Lcom/facebook/react/uimanager/j0$m;->b:Lcom/facebook/react/bridge/Callback;

    .line 79
    .line 80
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    move-object v2, v1

    .line 97
    filled-new-array/range {v1 .. v6}, [Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-interface {v7, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :catch_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/j0$m;->b:Lcom/facebook/react/bridge/Callback;

    .line 106
    .line 107
    new-array v0, v0, [Ljava/lang/Object;

    .line 108
    .line 109
    invoke-interface {v1, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method
