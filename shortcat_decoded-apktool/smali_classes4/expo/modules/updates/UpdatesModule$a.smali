.class public final Lexpo/modules/updates/UpdatesModule$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/updates/UpdatesModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/updates/UpdatesModule$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/File;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p3, Lxd/e;

    .line 2
    .line 3
    invoke-direct {p3, p1}, Lxd/e;-><init>(Ljava/io/File;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/Date;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3, p1, p2}, Lxd/e;->e(Ljava/util/Date;Lkotlin/jvm/functions/Function1;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, LTd/L;->a:LTd/L;

    .line 15
    .line 16
    return-object p1
.end method

.method public final b(Ljava/io/File;JLZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, LGf/f0;->b()LGf/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lexpo/modules/updates/UpdatesModule$a$a;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p2, p3, v2}, Lexpo/modules/updates/UpdatesModule$a$a;-><init>(Ljava/io/File;JLZd/e;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p4}, LGf/i;->g(LZd/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
