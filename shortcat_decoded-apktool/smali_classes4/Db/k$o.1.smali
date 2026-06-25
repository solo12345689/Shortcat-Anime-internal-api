.class public final LDb/k$o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDb/k;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LDb/k;


# direct methods
.method public constructor <init>(LDb/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LDb/k$o;->a:LDb/k;

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
    .locals 5

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
    aget-object v1, p1, v0

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    aget-object v2, p1, v2

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    aget-object p1, p1, v3

    .line 14
    .line 15
    check-cast p1, Lexpo/modules/filesystem/legacy/WritingOptions;

    .line 16
    .line 17
    check-cast v2, Ljava/lang/String;

    .line 18
    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v1}, LDb/l;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v3, p0, LDb/k$o;->a:LDb/k;

    .line 30
    .line 31
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object v4, Lexpo/modules/kotlin/services/FilePermissionService$a;->b:Lexpo/modules/kotlin/services/FilePermissionService$a;

    .line 35
    .line 36
    invoke-static {v3, v1, v4}, LDb/k;->C(LDb/k;Landroid/net/Uri;Lexpo/modules/kotlin/services/FilePermissionService$a;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lexpo/modules/filesystem/legacy/WritingOptions;->getEncoding()Lexpo/modules/filesystem/legacy/EncodingType;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {p1}, Lexpo/modules/filesystem/legacy/WritingOptions;->getAppend()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iget-object v4, p0, LDb/k$o;->a:LDb/k;

    .line 48
    .line 49
    invoke-static {v4, v1, p1}, LDb/k;->P(LDb/k;Landroid/net/Uri;Z)Ljava/io/OutputStream;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :try_start_0
    sget-object v1, Lexpo/modules/filesystem/legacy/EncodingType;->BASE64:Lexpo/modules/filesystem/legacy/EncodingType;

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    if-ne v3, v1, :cond_0

    .line 57
    .line 58
    invoke-static {v2, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception v0

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    new-instance v0, Ljava/io/OutputStreamWriter;

    .line 69
    .line 70
    invoke-direct {v0, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    :try_start_1
    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    :try_start_2
    invoke-static {v0, v4}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 82
    .line 83
    invoke-static {p1, v4}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    sget-object p1, LTd/L;->a:LTd/L;

    .line 87
    .line 88
    return-object p1

    .line 89
    :catchall_1
    move-exception v1

    .line 90
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 91
    :catchall_2
    move-exception v2

    .line 92
    :try_start_4
    invoke-static {v0, v1}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 96
    :goto_1
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 97
    :catchall_3
    move-exception v1

    .line 98
    invoke-static {p1, v0}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    throw v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LDb/k$o;->a([Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
