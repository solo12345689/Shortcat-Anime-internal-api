.class public LE6/n;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE6/m;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:LE6/p;

.field private final e:Ljava/util/Map;


# direct methods
.method public constructor <init>(IIILE6/p;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LE6/n;->a:I

    .line 5
    .line 6
    iput p2, p0, LE6/n;->b:I

    .line 7
    .line 8
    iput p3, p0, LE6/n;->c:I

    .line 9
    .line 10
    iput-object p4, p0, LE6/n;->d:LE6/p;

    .line 11
    .line 12
    iput-object p5, p0, LE6/n;->e:Ljava/util/Map;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public getExtras()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LE6/n;->e:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget v0, p0, LE6/n;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget v0, p0, LE6/n;->a:I

    .line 2
    .line 3
    return v0
.end method
