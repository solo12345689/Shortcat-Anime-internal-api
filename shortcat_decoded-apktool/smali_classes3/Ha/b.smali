.class public final LHa/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/uimanager/events/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LHa/b$a;
    }
.end annotation


# static fields
.field public static final h:LHa/b$a;


# instance fields
.field private final a:Lcom/facebook/react/views/view/g;

.field private final b:Lcom/facebook/react/uimanager/b0;

.field private final c:LEa/l;

.field private d:Lie/a;

.field private final e:I

.field private final f:Lcom/facebook/react/bridge/UIManager;

.field private final g:Lcom/facebook/react/uimanager/events/EventDispatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LHa/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LHa/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LHa/b;->h:LHa/b$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/views/view/g;Lcom/facebook/react/uimanager/b0;LEa/l;Lie/a;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "reactContext"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "config"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "callback"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LHa/b;->a:Lcom/facebook/react/views/view/g;

    .line 25
    .line 26
    iput-object p2, p0, LHa/b;->b:Lcom/facebook/react/uimanager/b0;

    .line 27
    .line 28
    iput-object p3, p0, LHa/b;->c:LEa/l;

    .line 29
    .line 30
    iput-object p4, p0, LHa/b;->d:Lie/a;

    .line 31
    .line 32
    const/4 p1, 0x2

    .line 33
    iput p1, p0, LHa/b;->e:I

    .line 34
    .line 35
    invoke-virtual {p2}, Lcom/facebook/react/uimanager/b0;->b()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    invoke-static {p3, p1}, Lcom/facebook/react/uimanager/f0;->g(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    iput-object p3, p0, LHa/b;->f:Lcom/facebook/react/bridge/UIManager;

    .line 44
    .line 45
    invoke-virtual {p2}, Lcom/facebook/react/uimanager/b0;->b()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-static {p2, p1}, Lcom/facebook/react/uimanager/f0;->b(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, LHa/b;->g:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 54
    .line 55
    return-void
.end method

.method public static synthetic a(LEa/k;Lcom/facebook/react/views/view/g;LHa/b;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHa/b;->d(LEa/k;Lcom/facebook/react/views/view/g;LHa/b;Landroid/content/DialogInterface;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final d(LEa/k;Lcom/facebook/react/views/view/g;LHa/b;Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    const/4 p3, 0x0

    .line 2
    const/4 v0, 0x3

    .line 3
    invoke-static {p0, p3, p3, v0, p3}, LEa/k;->q(LEa/k;Ljava/lang/Double;Ljava/lang/Boolean;ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LEa/k;->e()V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, LBa/h;->a(Landroid/view/ViewGroup;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p2, LHa/b;->d:Lie/a;

    .line 13
    .line 14
    invoke-interface {p0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, LEa/k;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1}, LEa/k;->o(Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, LHa/b;->g:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lcom/facebook/react/uimanager/events/EventDispatcher;->b(Lcom/facebook/react/uimanager/events/i;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, LHa/b;->g:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lcom/facebook/react/uimanager/events/EventDispatcher;->c(Lcom/facebook/react/uimanager/events/i;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public onEventDispatch(Lcom/facebook/react/uimanager/events/d;)V
    .locals 7

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->internal_getEventNameCompat()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "topShow"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :try_start_0
    iget-object v1, p0, LHa/b;->f:Lcom/facebook/react/bridge/UIManager;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/UIManager;->resolveView(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_0

    .line 34
    :catch_0
    move-exception v1

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-object v1, v0

    .line 37
    :goto_0
    instance-of v2, v1, Lcom/facebook/react/views/modal/d;

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    check-cast v1, Lcom/facebook/react/views/modal/d;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :goto_1
    sget-object v2, LFa/a;->a:LFa/a;

    .line 45
    .line 46
    invoke-static {}, LHa/c;->b()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    new-instance v4, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v5, "Can not resolve view for Modal#"

    .line 60
    .line 61
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v2, v3, p1, v1}, LFa/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    move-object v1, v0

    .line 75
    :goto_2
    if-nez v1, :cond_3

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_3
    invoke-virtual {v1}, Lcom/facebook/react/views/modal/d;->getDialog()Landroidx/activity/r;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    goto :goto_3

    .line 89
    :cond_4
    move-object v1, v0

    .line 90
    :goto_3
    if-eqz v1, :cond_5

    .line 91
    .line 92
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    if-eqz v2, :cond_5

    .line 97
    .line 98
    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    :cond_5
    check-cast v0, Landroid/view/ViewGroup;

    .line 103
    .line 104
    if-eqz v0, :cond_9

    .line 105
    .line 106
    new-instance v2, Lcom/facebook/react/views/view/g;

    .line 107
    .line 108
    iget-object v3, p0, LHa/b;->b:Lcom/facebook/react/uimanager/b0;

    .line 109
    .line 110
    invoke-direct {v2, v3}, Lcom/facebook/react/views/view/g;-><init>(Landroid/content/Context;)V

    .line 111
    .line 112
    .line 113
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 114
    .line 115
    const/4 v4, 0x0

    .line 116
    invoke-direct {v3, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 120
    .line 121
    .line 122
    iget-object v3, p0, LHa/b;->a:Lcom/facebook/react/views/view/g;

    .line 123
    .line 124
    iget-object v4, p0, LHa/b;->b:Lcom/facebook/react/uimanager/b0;

    .line 125
    .line 126
    iget-object v5, p0, LHa/b;->c:LEa/l;

    .line 127
    .line 128
    new-instance v6, LEa/k;

    .line 129
    .line 130
    invoke-direct {v6, v3, v0, v4, v5}, LEa/k;-><init>(Lcom/facebook/react/views/view/g;Landroid/view/View;Lcom/facebook/react/uimanager/b0;LEa/l;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 134
    .line 135
    .line 136
    invoke-static {}, LHa/c;->a()Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-eqz v3, :cond_7

    .line 141
    .line 142
    iget-object v3, p0, LHa/b;->d:Lie/a;

    .line 143
    .line 144
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    check-cast v3, LEa/k;

    .line 149
    .line 150
    if-eqz v3, :cond_6

    .line 151
    .line 152
    const/4 v4, 0x1

    .line 153
    invoke-virtual {v3, v4}, LEa/k;->o(Z)V

    .line 154
    .line 155
    .line 156
    :cond_6
    invoke-static {v0, v6}, Landroidx/core/view/a0;->C0(Landroid/view/View;Landroidx/core/view/p0$b;)V

    .line 157
    .line 158
    .line 159
    invoke-static {v2, v6}, Landroidx/core/view/a0;->w0(Landroid/view/View;Landroidx/core/view/I;)V

    .line 160
    .line 161
    .line 162
    const-wide/16 v3, 0x0

    .line 163
    .line 164
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 169
    .line 170
    invoke-virtual {v6, v0, v3}, LEa/k;->p(Ljava/lang/Double;Ljava/lang/Boolean;)V

    .line 171
    .line 172
    .line 173
    :cond_7
    if-eqz p1, :cond_8

    .line 174
    .line 175
    new-instance v0, LHa/a;

    .line 176
    .line 177
    invoke-direct {v0, v6, v2, p0}, LHa/a;-><init>(LEa/k;Lcom/facebook/react/views/view/g;LHa/b;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 181
    .line 182
    .line 183
    :cond_8
    if-eqz v1, :cond_9

    .line 184
    .line 185
    const/16 p1, 0x30

    .line 186
    .line 187
    invoke-virtual {v1, p1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 188
    .line 189
    .line 190
    :cond_9
    :goto_4
    return-void
.end method
