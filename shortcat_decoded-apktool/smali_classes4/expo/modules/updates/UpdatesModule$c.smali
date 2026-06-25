.class final Lexpo/modules/updates/UpdatesModule$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/updates/UpdatesModule;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lexpo/modules/updates/UpdatesModule;


# direct methods
.method constructor <init>(Lexpo/modules/updates/UpdatesModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/updates/UpdatesModule$c;->a:Lexpo/modules/updates/UpdatesModule;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 3

    .line 1
    new-instance v0, Lxd/g;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/updates/UpdatesModule$c;->a:Lexpo/modules/updates/UpdatesModule;

    .line 4
    .line 5
    invoke-static {v1}, Lexpo/modules/updates/UpdatesModule;->x(Lexpo/modules/updates/UpdatesModule;)Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "getFilesDir(...)"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Lxd/g;-><init>(Ljava/io/File;)V

    .line 19
    .line 20
    .line 21
    const-string v1, "UpdatesModule: getConstants called"

    .line 22
    .line 23
    sget-object v2, Lxd/b;->b:Lxd/b;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lxd/g;->i(Ljava/lang/String;Lxd/b;)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lexpo/modules/updates/f;->a()Lexpo/modules/updates/c;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, Lexpo/modules/updates/c;->j()Lexpo/modules/updates/c$c;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lexpo/modules/updates/c$c;->a()Ljava/util/Map;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/updates/UpdatesModule$c;->a()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
