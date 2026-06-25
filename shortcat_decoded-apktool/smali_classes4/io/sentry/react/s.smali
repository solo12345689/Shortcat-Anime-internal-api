.class public Lio/sentry/react/s;
.super Landroidx/fragment/app/K$l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lio/sentry/android/core/g0;

.field private final b:Ljava/lang/Runnable;

.field private final c:Lio/sentry/ILogger;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/g0;Ljava/lang/Runnable;Lio/sentry/ILogger;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/K$l;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/react/s;->a:Lio/sentry/android/core/g0;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/react/s;->b:Ljava/lang/Runnable;

    .line 7
    .line 8
    iput-object p3, p0, Lio/sentry/react/s;->c:Lio/sentry/ILogger;

    .line 9
    .line 10
    return-void
.end method

.method static bridge synthetic o(Lio/sentry/react/s;)Lio/sentry/android/core/g0;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/react/s;->a:Lio/sentry/android/core/g0;

    .line 2
    .line 3
    return-object p0
.end method

.method private static p(Landroid/view/View;I)Lcom/facebook/react/uimanager/events/EventDispatcher;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/uimanager/f0;->d(Landroid/view/View;)Lcom/facebook/react/bridge/ReactContext;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/f0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method


# virtual methods
.method public m(Landroidx/fragment/app/K;Landroidx/fragment/app/q;Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string p2, "com.swmansion.rnscreens.X"

    .line 10
    .line 11
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 p2, 0x0

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lio/sentry/react/s;->c:Lio/sentry/ILogger;

    .line 19
    .line 20
    sget-object p3, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 21
    .line 22
    const-string p4, "Fragment is not a ScreenStackFragment, won\'t listen for the first draw."

    .line 23
    .line 24
    new-array p2, p2, [Ljava/lang/Object;

    .line 25
    .line 26
    invoke-interface {p1, p3, p4, p2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    instance-of p1, p3, Landroid/view/ViewGroup;

    .line 31
    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    iget-object p1, p0, Lio/sentry/react/s;->c:Lio/sentry/ILogger;

    .line 35
    .line 36
    sget-object p3, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 37
    .line 38
    const-string p4, "Fragment view is not a ViewGroup, won\'t listen for the first draw."

    .line 39
    .line 40
    new-array p2, p2, [Ljava/lang/Object;

    .line 41
    .line 42
    invoke-interface {p1, p3, p4, p2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    move-object p1, p3

    .line 47
    check-cast p1, Landroid/view/ViewGroup;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 50
    .line 51
    .line 52
    move-result p4

    .line 53
    if-nez p4, :cond_2

    .line 54
    .line 55
    iget-object p1, p0, Lio/sentry/react/s;->c:Lio/sentry/ILogger;

    .line 56
    .line 57
    sget-object p3, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 58
    .line 59
    const-string p4, "Fragment view has no children, won\'t listen for the first draw."

    .line 60
    .line 61
    new-array p2, p2, [Ljava/lang/Object;

    .line 62
    .line 63
    invoke-interface {p1, p3, p4, p2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-eqz p1, :cond_6

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object p4

    .line 77
    instance-of p4, p4, Lcom/facebook/react/bridge/ReactContext;

    .line 78
    .line 79
    if-nez p4, :cond_3

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 83
    .line 84
    .line 85
    move-result p4

    .line 86
    const/4 v0, -0x1

    .line 87
    if-ne p4, v0, :cond_4

    .line 88
    .line 89
    iget-object p1, p0, Lio/sentry/react/s;->c:Lio/sentry/ILogger;

    .line 90
    .line 91
    sget-object p3, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 92
    .line 93
    const-string p4, "Screen has no id, won\'t listen for the first draw."

    .line 94
    .line 95
    new-array p2, p2, [Ljava/lang/Object;

    .line 96
    .line 97
    invoke-interface {p1, p3, p4, p2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_4
    invoke-static {p1, p4}, Lio/sentry/react/s;->p(Landroid/view/View;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-nez p1, :cond_5

    .line 106
    .line 107
    iget-object p1, p0, Lio/sentry/react/s;->c:Lio/sentry/ILogger;

    .line 108
    .line 109
    sget-object p3, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 110
    .line 111
    const-string p4, "Screen has no event dispatcher, won\'t listen for the first draw."

    .line 112
    .line 113
    new-array p2, p2, [Ljava/lang/Object;

    .line 114
    .line 115
    invoke-interface {p1, p3, p4, p2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_5
    iget-object p2, p0, Lio/sentry/react/s;->b:Ljava/lang/Runnable;

    .line 120
    .line 121
    new-instance p4, Lio/sentry/react/s$a;

    .line 122
    .line 123
    invoke-direct {p4, p0, p1, p3, p2}, Lio/sentry/react/s$a;-><init>(Lio/sentry/react/s;Lcom/facebook/react/uimanager/events/EventDispatcher;Landroid/view/View;Ljava/lang/Runnable;)V

    .line 124
    .line 125
    .line 126
    invoke-interface {p1, p4}, Lcom/facebook/react/uimanager/events/EventDispatcher;->c(Lcom/facebook/react/uimanager/events/i;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_6
    :goto_0
    iget-object p1, p0, Lio/sentry/react/s;->c:Lio/sentry/ILogger;

    .line 131
    .line 132
    sget-object p3, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 133
    .line 134
    const-string p4, "Fragment view has no ReactContext, won\'t listen for the first draw."

    .line 135
    .line 136
    new-array p2, p2, [Ljava/lang/Object;

    .line 137
    .line 138
    invoke-interface {p1, p3, p4, p2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    return-void
.end method
