.class public final LQb/a$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:[B


# direct methods
.method public constructor <init>(II[B)V
    .locals 1

    .line 1
    const-string v0, "rgba"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p1, p0, LQb/a$b;->a:I

    .line 10
    .line 11
    iput p2, p0, LQb/a$b;->b:I

    .line 12
    .line 13
    iput-object p3, p0, LQb/a$b;->c:[B

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, LQb/a$b;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()[B
    .locals 1

    .line 1
    iget-object v0, p0, LQb/a$b;->c:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, LQb/a$b;->a:I

    .line 2
    .line 3
    return v0
.end method
