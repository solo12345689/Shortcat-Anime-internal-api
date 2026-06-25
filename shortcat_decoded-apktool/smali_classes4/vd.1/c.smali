.class public final Lvd/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lvd/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvd/c$b;
    }
.end annotation


# static fields
.field public static final h:Lvd/c$b;

.field private static final i:Ljava/lang/String;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lxd/g;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/Void;

.field private final e:Ljava/lang/Void;

.field private final f:Ljava/lang/Void;

.field private final g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lvd/c$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvd/c$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lvd/c;->h:Lvd/c$b;

    .line 8
    .line 9
    const-class v0, Lvd/c;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lvd/c;->i:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lxd/g;Ljava/lang/Exception;LGf/O;)V
    .locals 6

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "logger"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "launcherScope"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lvd/c;->a:Landroid/content/Context;

    .line 20
    .line 21
    iput-object p2, p0, Lvd/c;->b:Lxd/g;

    .line 22
    .line 23
    const-string p1, "index.android.bundle"

    .line 24
    .line 25
    iput-object p1, p0, Lvd/c;->c:Ljava/lang/String;

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    iput-boolean p1, p0, Lvd/c;->g:Z

    .line 29
    .line 30
    if-eqz p3, :cond_0

    .line 31
    .line 32
    new-instance v3, Lvd/c$a;

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    invoke-direct {v3, p0, p3, p1}, Lvd/c$a;-><init>(Lvd/c;Ljava/lang/Exception;LZd/e;)V

    .line 36
    .line 37
    .line 38
    const/4 v4, 0x3

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v1, 0x0

    .line 41
    const/4 v2, 0x0

    .line 42
    move-object v0, p4

    .line 43
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method public static final synthetic f(Lvd/c;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lvd/c;->j(Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final j(Ljava/lang/Exception;)V
    .locals 6

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lvd/c;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "expo-error.log"

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v1, LDf/d;->b:Ljava/nio/charset/Charset;

    .line 19
    .line 20
    invoke-static {v0, p1, v1}, Lfe/k;->e(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception v0

    .line 25
    move-object p1, v0

    .line 26
    move-object v2, p1

    .line 27
    iget-object v0, p0, Lvd/c;->b:Lxd/g;

    .line 28
    .line 29
    const/4 v4, 0x4

    .line 30
    const/4 v5, 0x0

    .line 31
    const-string v1, "Failed to write fatal error to log"

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-static/range {v0 .. v5}, Lxd/g;->h(Lxd/g;Ljava/lang/String;Ljava/lang/Exception;Lxd/b;ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lvd/c;->i()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/util/Map;

    .line 6
    .line 7
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lvd/c;->g()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/String;

    .line 6
    .line 7
    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lvd/c;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic d()Lrd/d;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lvd/c;->h()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lrd/d;

    .line 6
    .line 7
    return-object v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lvd/c;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public g()Ljava/lang/Void;
    .locals 1

    .line 1
    iget-object v0, p0, Lvd/c;->e:Ljava/lang/Void;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Ljava/lang/Void;
    .locals 1

    .line 1
    iget-object v0, p0, Lvd/c;->d:Ljava/lang/Void;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Ljava/lang/Void;
    .locals 1

    .line 1
    iget-object v0, p0, Lvd/c;->f:Ljava/lang/Void;

    .line 2
    .line 3
    return-object v0
.end method
