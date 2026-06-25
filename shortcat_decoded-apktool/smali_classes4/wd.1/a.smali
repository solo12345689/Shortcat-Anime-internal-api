.class public final Lwd/a;
.super Lwd/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwd/a$a;
    }
.end annotation


# static fields
.field public static final w:Lwd/a$a;


# instance fields
.field private final t:Lexpo/modules/updates/d;

.field private final u:Lwd/j;

.field private final v:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwd/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lwd/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lwd/a;->w:Lwd/a$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;Ljava/io/File;)V
    .locals 11

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "database"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatesDirectory"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v7, Lwd/j;

    invoke-direct {v7}, Lwd/j;-><init>()V

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v10}, Lwd/a;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;Ljava/io/File;Lwd/j;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;Ljava/io/File;Lwd/j;Z)V
    .locals 10

    move-object/from16 v6, p6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "database"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatesDirectory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loaderFiles"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x40

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 2
    invoke-direct/range {v0 .. v9}, Lwd/i;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;Ljava/io/File;Lwd/j;LGf/O;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p2, p0, Lwd/a;->t:Lexpo/modules/updates/d;

    .line 4
    iput-object v6, p0, Lwd/a;->u:Lwd/j;

    move/from16 p1, p7

    .line 5
    iput-boolean p1, p0, Lwd/a;->v:Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;Ljava/io/File;Lwd/j;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move v8, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    goto :goto_1

    :cond_0
    move/from16 v8, p7

    goto :goto_0

    .line 1
    :goto_1
    invoke-direct/range {v1 .. v8}, Lwd/a;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;Ljava/io/File;Lwd/j;Z)V

    return-void
.end method


# virtual methods
.method protected l(Lrd/a;Ljava/io/File;Lexpo/modules/updates/d;Lrd/d;Lrd/d;LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-boolean p3, p0, Lwd/a;->v:Z

    .line 2
    .line 3
    const/4 p4, 0x1

    .line 4
    if-nez p3, :cond_0

    .line 5
    .line 6
    new-instance p2, Ljava/util/Date;

    .line 7
    .line 8
    invoke-direct {p2}, Ljava/util/Date;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p2}, Lrd/a;->u(Ljava/util/Date;)V

    .line 12
    .line 13
    .line 14
    sget-object p2, LDd/a;->a:LDd/a;

    .line 15
    .line 16
    invoke-virtual {p2, p1}, LDd/a;->a(Lrd/a;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p1, p2}, Lrd/a;->F(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance p2, Lwd/g$a;

    .line 24
    .line 25
    invoke-direct {p2, p1, p4}, Lwd/g$a;-><init>(Lrd/a;Z)V

    .line 26
    .line 27
    .line 28
    return-object p2

    .line 29
    :cond_0
    sget-object p3, Lexpo/modules/updates/g;->a:Lexpo/modules/updates/g;

    .line 30
    .line 31
    invoke-virtual {p3, p1}, Lexpo/modules/updates/g;->c(Lrd/a;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    new-instance p5, Ljava/io/File;

    .line 36
    .line 37
    invoke-direct {p5, p2, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object p6, p0, Lwd/a;->u:Lwd/j;

    .line 41
    .line 42
    invoke-virtual {p0}, Lwd/i;->h()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p6, v0, p2, p3}, Lwd/j;->d(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    invoke-virtual {p1, p3}, Lrd/a;->F(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance p2, Lwd/g$a;

    .line 56
    .line 57
    const/4 p3, 0x0

    .line 58
    invoke-direct {p2, p1, p3}, Lwd/g$a;-><init>(Lrd/a;Z)V

    .line 59
    .line 60
    .line 61
    return-object p2

    .line 62
    :cond_1
    :try_start_0
    iget-object p2, p0, Lwd/a;->u:Lwd/j;

    .line 63
    .line 64
    invoke-virtual {p0}, Lwd/i;->h()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object p6

    .line 68
    invoke-virtual {p2, p1, p5, p6}, Lwd/j;->a(Lrd/a;Ljava/io/File;Landroid/content/Context;)[B

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {p1, p2}, Lrd/a;->y([B)V

    .line 73
    .line 74
    .line 75
    new-instance p2, Ljava/util/Date;

    .line 76
    .line 77
    invoke-direct {p2}, Ljava/util/Date;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p2}, Lrd/a;->u(Ljava/util/Date;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, p3}, Lrd/a;->F(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    new-instance p2, Lwd/g$a;

    .line 87
    .line 88
    invoke-direct {p2, p1, p4}, Lwd/g$a;-><init>(Lrd/a;Z)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    .line 91
    return-object p2

    .line 92
    :catch_0
    new-instance p2, Ljava/lang/AssertionError;

    .line 93
    .line 94
    invoke-virtual {p1}, Lrd/a;->b()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    if-eqz p3, :cond_2

    .line 99
    .line 100
    invoke-virtual {p1}, Lrd/a;->b()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    goto :goto_0

    .line 105
    :cond_2
    invoke-virtual {p1}, Lrd/a;->n()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    :goto_0
    new-instance p3, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string p4, "APK bundle must contain the expected embedded asset "

    .line 115
    .line 116
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    throw p2
.end method

.method protected m(Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/d;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, Lwd/a;->u:Lwd/j;

    .line 2
    .line 3
    invoke-virtual {p0}, Lwd/i;->h()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget-object p3, p0, Lwd/a;->t:Lexpo/modules/updates/d;

    .line 8
    .line 9
    invoke-virtual {p1, p2, p3}, Lwd/j;->e(Landroid/content/Context;Lexpo/modules/updates/d;)Lyd/q;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    new-instance p2, Lwd/v;

    .line 16
    .line 17
    new-instance p3, Lwd/w$b;

    .line 18
    .line 19
    invoke-direct {p3, p1}, Lwd/w$b;-><init>(Lyd/q;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-direct {p2, p1, p3, p1}, Lwd/v;-><init>(Lyd/n;Lwd/w$b;Lwd/w$a;)V

    .line 24
    .line 25
    .line 26
    return-object p2

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    .line 28
    .line 29
    const-string p2, "Embedded manifest is null"

    .line 30
    .line 31
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1
.end method
