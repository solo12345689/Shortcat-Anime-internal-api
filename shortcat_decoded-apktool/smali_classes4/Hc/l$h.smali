.class public final LHc/l$h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHc/l;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LHc/l;


# direct methods
.method public constructor <init>(LHc/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, LHc/l$h;->a:LHc/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    const-string v0, "<destruct>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-object v0, p1, v0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aget-object p1, p1, v1

    .line 11
    .line 12
    check-cast p1, Lqb/b;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v2, 0x1a

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-lt v1, v2, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, LHc/l$h;->a:LHc/l;

    .line 24
    .line 25
    invoke-static {v1}, LHc/l;->z(LHc/l;)LIc/f;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1, p1}, LIc/f;->e(Lqb/b;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    iget-object v1, p0, LHc/l$h;->a:LHc/l;

    .line 36
    .line 37
    invoke-virtual {v1}, Lgc/c;->i()LUb/d;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, LUb/d;->u()Lub/d;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    const-string v2, "sound"

    .line 48
    .line 49
    invoke-interface {p1, v2, v3}, Lqb/b;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    new-instance v4, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v5, "expo-notifications: Custom sound \'"

    .line 59
    .line 60
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v2, "\' not found in native app. Make sure the sound file (e.g. \'custom_sound.wav\') is included in the expo-notifications config plugin sounds array in app config."

    .line 67
    .line 68
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    const/4 v4, 0x2

    .line 76
    invoke-static {v1, v2, v3, v4, v3}, Lub/d;->c(Lub/d;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_0
    iget-object v1, p0, LHc/l$h;->a:LHc/l;

    .line 80
    .line 81
    invoke-static {v1}, LHc/l;->z(LHc/l;)LIc/f;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iget-object v2, p0, LHc/l$h;->a:LHc/l;

    .line 86
    .line 87
    invoke-static {v2, p1}, LHc/l;->C(LHc/l;Lqb/b;)Ljava/lang/CharSequence;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    iget-object v3, p0, LHc/l$h;->a:LHc/l;

    .line 92
    .line 93
    invoke-static {v3, p1}, LHc/l;->B(LHc/l;Lqb/b;)I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    invoke-interface {v1, v0, v2, v3, p1}, LIc/f;->c(Ljava/lang/String;Ljava/lang/CharSequence;ILqb/b;)Landroid/app/NotificationChannel;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iget-object v0, p0, LHc/l$h;->a:LHc/l;

    .line 102
    .line 103
    invoke-static {v0}, LHc/l;->A(LHc/l;)LJc/e;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v0, p1}, LJc/e;->a(Landroid/app/NotificationChannel;)Landroid/os/Bundle;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1

    .line 115
    :cond_1
    return-object v3
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LHc/l$h;->a([Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
