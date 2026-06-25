.class public final Lyc/a;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyc/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R&\u0010\u000c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0008\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000f"
    }
    d2 = {
        "Lyc/a;",
        "Lgc/c;",
        "<init>",
        "()V",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "Lkotlin/Function1;",
        "Landroid/net/Uri;",
        "LTd/L;",
        "d",
        "Lkotlin/jvm/functions/Function1;",
        "onURLReceivedObserver",
        "e",
        "a",
        "expo-linking_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final e:Lyc/a$a;

.field private static f:Landroid/net/Uri;

.field private static g:Ljava/util/Set;


# instance fields
.field private d:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyc/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lyc/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyc/a;->e:Lyc/a$a;

    .line 8
    .line 9
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lyc/a;->g:Ljava/util/Set;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lgc/c;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic A(Landroid/net/Uri;)V
    .locals 0

    .line 1
    sput-object p0, Lyc/a;->f:Landroid/net/Uri;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic B(Lyc/a;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyc/a;->d:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic x()Landroid/net/Uri;
    .locals 1

    .line 1
    sget-object v0, Lyc/a;->f:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic y(Lyc/a;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, Lyc/a;->d:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic z()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, Lyc/a;->g:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public n()Lgc/e;
    .locals 9

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "onURLReceived"

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, ".ModuleDefinition"

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v4, "["

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v4, "ExpoModulesCore"

    .line 37
    .line 38
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v4, "] "

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2}, LX3/a;->c(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :try_start_0
    new-instance v2, Lgc/d;

    .line 57
    .line 58
    invoke-direct {v2, p0}, Lgc/d;-><init>(Lgc/c;)V

    .line 59
    .line 60
    .line 61
    const-string v3, "ExpoLinking"

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Lgc/a;->s(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    filled-new-array {v1}, [Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v2, v3}, Lhc/f;->d([Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v3, "getLinkingURL"

    .line 74
    .line 75
    new-instance v4, Ldc/r;

    .line 76
    .line 77
    const/4 v5, 0x0

    .line 78
    new-array v5, v5, [Lpc/b;

    .line 79
    .line 80
    sget-object v6, Lpc/V;->a:Lpc/V;

    .line 81
    .line 82
    invoke-virtual {v6}, Lpc/V;->a()Ljava/util/Map;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    check-cast v7, Lpc/U;

    .line 95
    .line 96
    if-nez v7, :cond_0

    .line 97
    .line 98
    new-instance v7, Lpc/U;

    .line 99
    .line 100
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    invoke-direct {v7, v8}, Lpc/U;-><init>(Lpe/d;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6}, Lpc/V;->a()Ljava/util/Map;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-interface {v6, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :catchall_0
    move-exception v0

    .line 120
    goto :goto_1

    .line 121
    :cond_0
    :goto_0
    new-instance v0, Lyc/a$d;

    .line 122
    .line 123
    invoke-direct {v0}, Lyc/a$d;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-direct {v4, v3, v5, v7, v0}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Lhc/f;->p()Ljava/util/Map;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    new-instance v0, Lyc/a$b;

    .line 137
    .line 138
    invoke-direct {v0, p0}, Lyc/a$b;-><init>(Lyc/a;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v1, v0}, Lhc/f;->f(Ljava/lang/String;Lie/a;)V

    .line 142
    .line 143
    .line 144
    new-instance v0, Lyc/a$c;

    .line 145
    .line 146
    invoke-direct {v0, p0}, Lyc/a$c;-><init>(Lyc/a;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v1, v0}, Lhc/f;->h(Ljava/lang/String;Lie/a;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2}, Lgc/a;->u()Lgc/e;

    .line 153
    .line 154
    .line 155
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    invoke-static {}, LX3/a;->f()V

    .line 157
    .line 158
    .line 159
    return-object v0

    .line 160
    :goto_1
    invoke-static {}, LX3/a;->f()V

    .line 161
    .line 162
    .line 163
    throw v0
.end method
