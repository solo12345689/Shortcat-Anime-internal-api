.class public final LWb/i$d;
.super LWb/f;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWb/i;->n(Ljava/lang/String;Landroidx/lifecycle/r;LWb/d;LWb/e;)LWb/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:LWb/d;

.field final synthetic b:LWb/d;

.field final synthetic c:LWb/i;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:LWb/e;


# direct methods
.method constructor <init>(LWb/d;LWb/i;Ljava/lang/String;LWb/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LWb/i$d;->b:LWb/d;

    .line 2
    .line 3
    iput-object p2, p0, LWb/i$d;->c:LWb/i;

    .line 4
    .line 5
    iput-object p3, p0, LWb/i$d;->d:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, LWb/i$d;->e:LWb/e;

    .line 8
    .line 9
    invoke-direct {p0}, LWb/f;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, LWb/i$d;->a:LWb/d;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public b(Ljava/io/Serializable;Lg/b;)V
    .locals 6

    .line 1
    const-string v0, "input"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LWb/i$d;->c:LWb/i;

    .line 12
    .line 13
    invoke-static {v0}, LWb/i;->e(LWb/i;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, LWb/i$d;->d:Ljava/lang/String;

    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/Integer;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v1, p0, LWb/i$d;->c:LWb/i;

    .line 32
    .line 33
    invoke-static {v1}, LWb/i;->c(LWb/i;)Ljava/util/Map;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v2, p0, LWb/i$d;->d:Ljava/lang/String;

    .line 38
    .line 39
    new-instance v3, LWb/i$a;

    .line 40
    .line 41
    iget-object v4, p0, LWb/i$d;->e:LWb/e;

    .line 42
    .line 43
    iget-object v5, p0, LWb/i$d;->b:LWb/d;

    .line 44
    .line 45
    invoke-direct {v3, v4, p2, v5}, LWb/i$a;-><init>(LWb/e;Lg/b;LWb/d;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    iget-object p2, p0, LWb/i$d;->c:LWb/i;

    .line 52
    .line 53
    invoke-static {p2}, LWb/i;->d(LWb/i;)Ljava/util/Map;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    iget-object v1, p0, LWb/i$d;->d:Ljava/lang/String;

    .line 58
    .line 59
    invoke-interface {p2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    iget-object p2, p0, LWb/i$d;->c:LWb/i;

    .line 63
    .line 64
    invoke-static {p2}, LWb/i;->f(LWb/i;)Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    iget-object v1, p0, LWb/i$d;->d:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    :try_start_0
    iget-object p2, p0, LWb/i$d;->c:LWb/i;

    .line 74
    .line 75
    iget-object v1, p0, LWb/i$d;->b:LWb/d;

    .line 76
    .line 77
    invoke-virtual {p2, v0, v1, p1}, LWb/i;->k(ILWb/d;Ljava/io/Serializable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :catch_0
    move-exception p1

    .line 82
    iget-object p2, p0, LWb/i$d;->c:LWb/i;

    .line 83
    .line 84
    invoke-static {p2}, LWb/i;->f(LWb/i;)Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    iget-object v0, p0, LWb/i$d;->d:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 95
    .line 96
    iget-object v0, p0, LWb/i$d;->b:LWb/d;

    .line 97
    .line 98
    new-instance v1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v2, "Attempting to launch an unregistered ActivityResultLauncher with contract "

    .line 104
    .line 105
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v0, " and input "

    .line 112
    .line 113
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string p1, ". You must ensure the ActivityResultLauncher is registered before calling launch()"

    .line 120
    .line 121
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p2
.end method
