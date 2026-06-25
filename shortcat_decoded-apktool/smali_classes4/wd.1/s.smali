.class public final Lwd/s;
.super Lwd/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwd/s$a;
    }
.end annotation


# static fields
.field public static final w:Lwd/s$a;

.field private static final x:Ljava/lang/String;


# instance fields
.field private final t:Lwd/g;

.field private final u:Lrd/d;

.field private final v:Lwd/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwd/s$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lwd/s$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lwd/s;->w:Lwd/s$a;

    .line 8
    .line 9
    const-class v0, Lwd/s;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lwd/s;->x:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;Lwd/g;Ljava/io/File;Lrd/d;)V
    .locals 10

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "database"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileDownloader"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatesDirectory"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance v9, Lwd/j;

    invoke-direct {v9}, Lwd/j;-><init>()V

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v9}, Lwd/s;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;Lwd/g;Ljava/io/File;Lrd/d;Lwd/j;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;Lwd/g;Ljava/io/File;Lrd/d;Lwd/j;)V
    .locals 11

    move-object/from16 v0, p5

    move-object/from16 v7, p8

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "configuration"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "logger"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "database"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "mFileDownloader"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "updatesDirectory"

    move-object/from16 v6, p6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "loaderFiles"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 1
    invoke-direct/range {v1 .. v10}, Lwd/i;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;Ljava/io/File;Lwd/j;LGf/O;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object v0, p0, Lwd/s;->t:Lwd/g;

    move-object/from16 p1, p7

    .line 3
    iput-object p1, p0, Lwd/s;->u:Lrd/d;

    .line 4
    iput-object v7, p0, Lwd/s;->v:Lwd/j;

    return-void
.end method

.method public static synthetic r(Lwd/s;Lrd/a;D)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lwd/s;->s(Lwd/s;Lrd/a;D)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final s(Lwd/s;Lrd/a;D)LTd/L;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lwd/i;->e(Lrd/a;D)V

    .line 2
    .line 3
    .line 4
    sget-object p0, LTd/L;->a:LTd/L;

    .line 5
    .line 6
    return-object p0
.end method


# virtual methods
.method protected l(Lrd/a;Ljava/io/File;Lexpo/modules/updates/d;Lrd/d;Lrd/d;LZd/e;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object p3, Lwd/g;->h:Lwd/g$b;

    .line 2
    .line 3
    iget-object v0, p0, Lwd/s;->u:Lrd/d;

    .line 4
    .line 5
    invoke-virtual {p3, v0, p5, p4}, Lwd/g$b;->a(Lrd/d;Lrd/d;Lrd/d;)Lorg/json/JSONObject;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    iget-object v1, p0, Lwd/s;->t:Lwd/g;

    .line 10
    .line 11
    iget-object v5, p0, Lwd/s;->u:Lrd/d;

    .line 12
    .line 13
    new-instance v7, Lwd/q;

    .line 14
    .line 15
    invoke-direct {v7, p0, p1}, Lwd/q;-><init>(Lwd/s;Lrd/a;)V

    .line 16
    .line 17
    .line 18
    move-object v2, p1

    .line 19
    move-object v3, p2

    .line 20
    move-object v6, p4

    .line 21
    move-object v8, p6

    .line 22
    invoke-virtual/range {v1 .. v8}, Lwd/g;->l(Lrd/a;Ljava/io/File;Lorg/json/JSONObject;Lrd/d;Lrd/d;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method protected m(Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/d;LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lwd/s;->v:Lwd/j;

    .line 2
    .line 3
    invoke-virtual {p0}, Lwd/i;->h()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1, p2}, Lwd/j;->e(Landroid/content/Context;Lexpo/modules/updates/d;)Lyd/q;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Lyd/q;->c()Lrd/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    sget-object v1, Lwd/g;->h:Lwd/g$b;

    .line 20
    .line 21
    iget-object v2, p0, Lwd/s;->u:Lrd/d;

    .line 22
    .line 23
    invoke-virtual {v1, p1, p2, v2, v0}, Lwd/g$b;->b(Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/d;Lrd/d;Lrd/d;)Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p2, p0, Lwd/s;->t:Lwd/g;

    .line 28
    .line 29
    invoke-virtual {p2, p1, p3}, Lwd/g;->r(Lorg/json/JSONObject;LZd/e;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method
