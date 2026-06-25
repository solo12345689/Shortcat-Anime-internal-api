.class public final LK/f0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lie/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(IILie/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LK/f0;->a:I

    .line 5
    .line 6
    iput p2, p0, LK/f0;->b:I

    .line 7
    .line 8
    iput-object p3, p0, LK/f0;->c:Lie/a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, LK/f0;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()Lie/a;
    .locals 1

    .line 1
    iget-object v0, p0, LK/f0;->c:Lie/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, LK/f0;->a:I

    .line 2
    .line 3
    return v0
.end method
