.class public final LA4/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LA4/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA4/j$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA4/j;->a:Ljava/io/File;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LZd/e;)Ljava/lang/Object;
    .locals 11

    .line 1
    new-instance p1, LA4/m;

    .line 2
    .line 3
    sget-object v0, Ltg/P;->b:Ltg/P$a;

    .line 4
    .line 5
    iget-object v1, p0, LA4/j;->a:Ljava/io/File;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-static {v0, v1, v4, v2, v3}, Ltg/P$a;->d(Ltg/P$a;Ljava/io/File;ZILjava/lang/Object;)Ltg/P;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    const/16 v9, 0xe

    .line 15
    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x0

    .line 20
    invoke-static/range {v5 .. v10}, Lx4/q;->d(Ltg/P;Ltg/o;Ljava/lang/String;Ljava/io/Closeable;ILjava/lang/Object;)Lx4/p;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v2, p0, LA4/j;->a:Ljava/io/File;

    .line 29
    .line 30
    invoke-static {v2}, Lfe/k;->A(Ljava/io/File;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    sget-object v2, Lx4/f;->c:Lx4/f;

    .line 39
    .line 40
    invoke-direct {p1, v0, v1, v2}, LA4/m;-><init>(Lx4/p;Ljava/lang/String;Lx4/f;)V

    .line 41
    .line 42
    .line 43
    return-object p1
.end method
