.class public final Lw2/o$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw2/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/net/Uri;

.field private b:J

.field private c:I

.field private d:[B

.field private e:Ljava/util/Map;

.field private f:J

.field private g:J

.field private h:Ljava/lang/String;

.field private i:I

.field private j:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lw2/o$b;->c:I

    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object v0, p0, Lw2/o$b;->e:Ljava/util/Map;

    const-wide/16 v0, -0x1

    .line 5
    iput-wide v0, p0, Lw2/o$b;->g:J

    return-void
.end method

.method private constructor <init>(Lw2/o;)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iget-object v0, p1, Lw2/o;->a:Landroid/net/Uri;

    iput-object v0, p0, Lw2/o$b;->a:Landroid/net/Uri;

    .line 8
    iget-wide v0, p1, Lw2/o;->b:J

    iput-wide v0, p0, Lw2/o$b;->b:J

    .line 9
    iget v0, p1, Lw2/o;->c:I

    iput v0, p0, Lw2/o$b;->c:I

    .line 10
    iget-object v0, p1, Lw2/o;->d:[B

    iput-object v0, p0, Lw2/o$b;->d:[B

    .line 11
    iget-object v0, p1, Lw2/o;->e:Ljava/util/Map;

    iput-object v0, p0, Lw2/o$b;->e:Ljava/util/Map;

    .line 12
    iget-wide v0, p1, Lw2/o;->g:J

    iput-wide v0, p0, Lw2/o$b;->f:J

    .line 13
    iget-wide v0, p1, Lw2/o;->h:J

    iput-wide v0, p0, Lw2/o$b;->g:J

    .line 14
    iget-object v0, p1, Lw2/o;->i:Ljava/lang/String;

    iput-object v0, p0, Lw2/o$b;->h:Ljava/lang/String;

    .line 15
    iget v0, p1, Lw2/o;->j:I

    iput v0, p0, Lw2/o$b;->i:I

    .line 16
    iget-object p1, p1, Lw2/o;->k:Ljava/lang/Object;

    iput-object p1, p0, Lw2/o$b;->j:Ljava/lang/Object;

    return-void
.end method

.method synthetic constructor <init>(Lw2/o;Lw2/o$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lw2/o$b;-><init>(Lw2/o;)V

    return-void
.end method


# virtual methods
.method public a()Lw2/o;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lw2/o$b;->a:Landroid/net/Uri;

    .line 4
    .line 5
    const-string v2, "The uri must be set."

    .line 6
    .line 7
    invoke-static {v1, v2}, Lt2/a;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    new-instance v3, Lw2/o;

    .line 11
    .line 12
    iget-object v4, v0, Lw2/o$b;->a:Landroid/net/Uri;

    .line 13
    .line 14
    iget-wide v5, v0, Lw2/o$b;->b:J

    .line 15
    .line 16
    iget v7, v0, Lw2/o$b;->c:I

    .line 17
    .line 18
    iget-object v8, v0, Lw2/o$b;->d:[B

    .line 19
    .line 20
    iget-object v9, v0, Lw2/o$b;->e:Ljava/util/Map;

    .line 21
    .line 22
    iget-wide v10, v0, Lw2/o$b;->f:J

    .line 23
    .line 24
    iget-wide v12, v0, Lw2/o$b;->g:J

    .line 25
    .line 26
    iget-object v14, v0, Lw2/o$b;->h:Ljava/lang/String;

    .line 27
    .line 28
    iget v15, v0, Lw2/o$b;->i:I

    .line 29
    .line 30
    iget-object v1, v0, Lw2/o$b;->j:Ljava/lang/Object;

    .line 31
    .line 32
    const/16 v17, 0x0

    .line 33
    .line 34
    move-object/from16 v16, v1

    .line 35
    .line 36
    invoke-direct/range {v3 .. v17}, Lw2/o;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;ILjava/lang/Object;Lw2/o$a;)V

    .line 37
    .line 38
    .line 39
    return-object v3
.end method

.method public b(I)Lw2/o$b;
    .locals 0

    .line 1
    iput p1, p0, Lw2/o$b;->i:I

    .line 2
    .line 3
    return-object p0
.end method

.method public c([B)Lw2/o$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lw2/o$b;->d:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public d(I)Lw2/o$b;
    .locals 0

    .line 1
    iput p1, p0, Lw2/o$b;->c:I

    .line 2
    .line 3
    return-object p0
.end method

.method public e(Ljava/util/Map;)Lw2/o$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lw2/o$b;->e:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public f(Ljava/lang/String;)Lw2/o$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lw2/o$b;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public g(J)Lw2/o$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lw2/o$b;->g:J

    .line 2
    .line 3
    return-object p0
.end method

.method public h(J)Lw2/o$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lw2/o$b;->f:J

    .line 2
    .line 3
    return-object p0
.end method

.method public i(Landroid/net/Uri;)Lw2/o$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lw2/o$b;->a:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method public j(Ljava/lang/String;)Lw2/o$b;
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lw2/o$b;->a:Landroid/net/Uri;

    .line 6
    .line 7
    return-object p0
.end method

.method public k(J)Lw2/o$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lw2/o$b;->b:J

    .line 2
    .line 3
    return-object p0
.end method
