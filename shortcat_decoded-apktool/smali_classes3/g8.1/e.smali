.class public Lg8/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lg8/b;


# static fields
.field public static final c:Lg8/e;


# instance fields
.field private final a:I

.field private b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lg8/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lg8/e;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lg8/e;->c:Lg8/e;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lg8/e;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static c(Lcom/github/penfeizhou/animation/gif/io/GifReader;)Lg8/e;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lg8/e;->c:Lg8/e;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v1, Lg8/e;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lg8/e;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/io/c;->position()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, v1, Lg8/e;->b:I

    .line 22
    .line 23
    invoke-virtual {v1, p0}, Lg8/e;->a(Lcom/github/penfeizhou/animation/gif/io/GifReader;)V

    .line 24
    .line 25
    .line 26
    return-object v1
.end method


# virtual methods
.method public a(Lcom/github/penfeizhou/animation/gif/io/GifReader;)V
    .locals 2

    .line 1
    iget v0, p0, Lg8/e;->a:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    invoke-virtual {p1, v0, v1}, Lcom/github/penfeizhou/animation/io/c;->skip(J)J

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public b()Z
    .locals 1

    .line 1
    sget-object v0, Lg8/e;->c:Lg8/e;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method
