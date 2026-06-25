.class public LYh/p;
.super LYh/s;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LYh/s;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LYh/p;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, LYh/p;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, LYh/p;->i:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public n()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LYh/p;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LYh/p;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LYh/p;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
