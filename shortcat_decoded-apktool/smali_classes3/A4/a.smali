.class public final LA4/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LA4/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA4/a$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/net/Uri;

.field private final b:LG4/m;


# direct methods
.method public constructor <init>(Landroid/net/Uri;LG4/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA4/a;->a:Landroid/net/Uri;

    .line 5
    .line 6
    iput-object p2, p0, LA4/a;->b:LG4/m;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(LZd/e;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object p1, p0, LA4/a;->a:Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-static {p1, v0}, LUd/u;->g0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/16 v8, 0x3e

    .line 13
    .line 14
    const/4 v9, 0x0

    .line 15
    const-string v2, "/"

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    invoke-static/range {v1 .. v9}, LUd/u;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v0, LA4/m;

    .line 27
    .line 28
    iget-object v1, p0, LA4/a;->b:LG4/m;

    .line 29
    .line 30
    invoke-virtual {v1}, LG4/m;->g()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Ltg/K;->k(Ljava/io/InputStream;)Ltg/Z;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1}, Ltg/K;->d(Ltg/Z;)Ltg/j;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v2, p0, LA4/a;->b:LG4/m;

    .line 51
    .line 52
    invoke-virtual {v2}, LG4/m;->g()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    new-instance v3, Lx4/a;

    .line 57
    .line 58
    invoke-direct {v3, p1}, Lx4/a;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v2, v3}, Lx4/q;->b(Ltg/j;Landroid/content/Context;Lx4/p$a;)Lx4/p;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {v2, p1}, LL4/j;->j(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    sget-object v2, Lx4/f;->c:Lx4/f;

    .line 74
    .line 75
    invoke-direct {v0, v1, p1, v2}, LA4/m;-><init>(Lx4/p;Ljava/lang/String;Lx4/f;)V

    .line 76
    .line 77
    .line 78
    return-object v0
.end method
