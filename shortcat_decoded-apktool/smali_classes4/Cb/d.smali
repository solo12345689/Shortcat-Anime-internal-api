.class public final LCb/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LWb/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LCb/d$a;
    }
.end annotation


# instance fields
.field private final a:Lic/a;


# direct methods
.method public constructor <init>(Lic/a;)V
    .locals 1

    .line 1
    const-string v0, "appContextProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LCb/d;->a:Lic/a;

    .line 10
    .line 11
    return-void
.end method

.method private final d()Landroid/content/ContentResolver;
    .locals 2

    .line 1
    iget-object v0, p0, LCb/d;->a:Lic/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lic/a;->i()LUb/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LUb/d;->B()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "getContentResolver(...)"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    const-string v1, "React Application Context is null"

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/io/Serializable;ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LCb/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, LCb/d;->e(LCb/e;ILandroid/content/Intent;)LCb/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic b(Landroid/content/Context;Ljava/io/Serializable;)Landroid/content/Intent;
    .locals 0

    .line 1
    check-cast p2, LCb/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LCb/d;->c(Landroid/content/Context;LCb/e;)Landroid/content/Intent;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Landroid/content/Context;LCb/e;)Landroid/content/Intent;
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "input"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, LCb/e;->c()LCb/r;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object v0, LCb/r;->a:LCb/r;

    .line 16
    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    new-instance p1, Landroid/content/Intent;

    .line 20
    .line 21
    const-string v0, "android.intent.action.OPEN_DOCUMENT"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, LCb/e;->b()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    const-string v0, "*/*"

    .line 33
    .line 34
    :cond_0
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    new-instance p1, Landroid/content/Intent;

    .line 39
    .line 40
    const-string v0, "android.intent.action.OPEN_DOCUMENT_TREE"

    .line 41
    .line 42
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 46
    .line 47
    const/16 v1, 0x1a

    .line 48
    .line 49
    if-lt v0, v1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p2}, LCb/e;->a()Landroid/net/Uri;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    const-string v0, "android.provider.extra.INITIAL_URI"

    .line 56
    .line 57
    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 58
    .line 59
    .line 60
    :cond_2
    return-object p1
.end method

.method public e(LCb/e;ILandroid/content/Intent;)LCb/f;
    .locals 1

    .line 1
    const-string v0, "input"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_6

    .line 7
    .line 8
    if-nez p3, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p3}, Landroid/content/Intent;->getFlags()I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    and-int/lit8 p3, p3, 0x3

    .line 20
    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    invoke-direct {p0}, LCb/d;->d()Landroid/content/ContentResolver;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0, p2, p3}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p1}, LCb/e;->c()LCb/r;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object p3, LCb/d$a;->a:[I

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    aget p1, p3, p1

    .line 41
    .line 42
    const/4 p3, 0x1

    .line 43
    if-eq p1, p3, :cond_4

    .line 44
    .line 45
    const/4 p3, 0x2

    .line 46
    if-ne p1, p3, :cond_3

    .line 47
    .line 48
    new-instance p1, LCb/f$b;

    .line 49
    .line 50
    new-instance p3, Lexpo/modules/filesystem/FileSystemFile;

    .line 51
    .line 52
    if-nez p2, :cond_2

    .line 53
    .line 54
    sget-object p2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 55
    .line 56
    :cond_2
    invoke-static {p2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p3, p2}, Lexpo/modules/filesystem/FileSystemFile;-><init>(Landroid/net/Uri;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p1, p3}, LCb/f$b;-><init>(Lexpo/modules/filesystem/FileSystemPath;)V

    .line 63
    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_3
    new-instance p1, LTd/r;

    .line 67
    .line 68
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_4
    new-instance p1, LCb/f$b;

    .line 73
    .line 74
    new-instance p3, Lexpo/modules/filesystem/FileSystemDirectory;

    .line 75
    .line 76
    if-nez p2, :cond_5

    .line 77
    .line 78
    sget-object p2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 79
    .line 80
    :cond_5
    invoke-static {p2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p3, p2}, Lexpo/modules/filesystem/FileSystemDirectory;-><init>(Landroid/net/Uri;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p1, p3}, LCb/f$b;-><init>(Lexpo/modules/filesystem/FileSystemPath;)V

    .line 87
    .line 88
    .line 89
    return-object p1

    .line 90
    :cond_6
    :goto_0
    sget-object p1, LCb/f$a;->a:LCb/f$a;

    .line 91
    .line 92
    return-object p1
.end method
