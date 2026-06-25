.class public final LQa/B$b;
.super LQa/d$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQa/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQa/B$b$a;
    }
.end annotation


# static fields
.field public static final d:LQa/B$b$a;


# instance fields
.field private final b:Ljava/lang/Class;

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LQa/B$b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LQa/B$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LQa/B$b;->d:LQa/B$b$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LQa/d$c;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, LQa/B;

    .line 5
    .line 6
    iput-object v0, p0, LQa/B$b;->b:Ljava/lang/Class;

    .line 7
    .line 8
    const-string v0, "TapGestureHandler"

    .line 9
    .line 10
    iput-object v0, p0, LQa/B$b;->c:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/content/Context;)LQa/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LQa/B$b;->g(Landroid/content/Context;)LQa/B;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic c(LQa/d;)LRa/b;
    .locals 0

    .line 1
    check-cast p1, LQa/B;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LQa/B$b;->h(LQa/B;)LRa/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LQa/B$b;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, LQa/B$b;->b:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic f(LQa/d;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    .line 1
    check-cast p1, LQa/B;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LQa/B$b;->i(LQa/B;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected g(Landroid/content/Context;)LQa/B;
    .locals 0

    .line 1
    new-instance p1, LQa/B;

    .line 2
    .line 3
    invoke-direct {p1}, LQa/B;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public h(LQa/B;)LRa/j;
    .locals 1

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LRa/j;

    .line 7
    .line 8
    invoke-direct {v0, p1}, LRa/j;-><init>(LQa/B;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public i(LQa/B;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 2

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "config"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1, p2}, LQa/d$c;->f(LQa/d;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "numberOfTaps"

    .line 15
    .line 16
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {p1, v0}, LQa/B;->b1(LQa/B;I)V

    .line 27
    .line 28
    .line 29
    :cond_0
    const-string v0, "maxDurationMs"

    .line 30
    .line 31
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    int-to-long v0, v0

    .line 42
    invoke-static {p1, v0, v1}, LQa/B;->Z0(LQa/B;J)V

    .line 43
    .line 44
    .line 45
    :cond_1
    const-string v0, "maxDelayMs"

    .line 46
    .line 47
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    int-to-long v0, v0

    .line 58
    invoke-static {p1, v0, v1}, LQa/B;->V0(LQa/B;J)V

    .line 59
    .line 60
    .line 61
    :cond_2
    const-string v0, "maxDeltaX"

    .line 62
    .line 63
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/B;->h(D)F

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-static {p1, v0}, LQa/B;->W0(LQa/B;F)V

    .line 78
    .line 79
    .line 80
    :cond_3
    const-string v0, "maxDeltaY"

    .line 81
    .line 82
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_4

    .line 87
    .line 88
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 89
    .line 90
    .line 91
    move-result-wide v0

    .line 92
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/B;->h(D)F

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-static {p1, v0}, LQa/B;->X0(LQa/B;F)V

    .line 97
    .line 98
    .line 99
    :cond_4
    const-string v0, "maxDist"

    .line 100
    .line 101
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_5

    .line 106
    .line 107
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 108
    .line 109
    .line 110
    move-result-wide v0

    .line 111
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/B;->h(D)F

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-static {p1, v0}, LQa/B;->Y0(LQa/B;F)V

    .line 116
    .line 117
    .line 118
    :cond_5
    const-string v0, "minPointers"

    .line 119
    .line 120
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_6

    .line 125
    .line 126
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    invoke-static {p1, p2}, LQa/B;->a1(LQa/B;I)V

    .line 131
    .line 132
    .line 133
    :cond_6
    return-void
.end method
