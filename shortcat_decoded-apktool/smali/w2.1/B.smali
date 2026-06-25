.class public final Lw2/B;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lw2/g;


# static fields
.field public static final a:Lw2/B;

.field public static final b:Lw2/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lw2/B;

    .line 2
    .line 3
    invoke-direct {v0}, Lw2/B;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw2/B;->a:Lw2/B;

    .line 7
    .line 8
    new-instance v0, Lw2/A;

    .line 9
    .line 10
    invoke-direct {v0}, Lw2/A;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lw2/B;->b:Lw2/g$a;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic p()Lw2/B;
    .locals 1

    .line 1
    new-instance v0, Lw2/B;

    .line 2
    .line 3
    invoke-direct {v0}, Lw2/B;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a(Lw2/o;)J
    .locals 1

    .line 1
    new-instance p1, Ljava/io/IOException;

    .line 2
    .line 3
    const-string v0, "PlaceholderDataSource cannot be opened"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public c()Landroid/net/Uri;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public close()V
    .locals 0

    .line 1
    return-void
.end method

.method public i(Lw2/F;)V
    .locals 0

    .line 1
    return-void
.end method

.method public read([BII)I
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method
