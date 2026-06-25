.class public Lb5/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LS4/j;


# instance fields
.field private final a:Lb5/r;


# direct methods
.method public constructor <init>(Lb5/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb5/i;->a:Lb5/r;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILS4/h;)LU4/v;
    .locals 0

    .line 1
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lb5/i;->c(Ljava/nio/ByteBuffer;IILS4/h;)LU4/v;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;LS4/h;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lb5/i;->d(Ljava/nio/ByteBuffer;LS4/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(Ljava/nio/ByteBuffer;IILS4/h;)LU4/v;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/i;->a:Lb5/r;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lb5/r;->g(Ljava/nio/ByteBuffer;IILS4/h;)LU4/v;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public d(Ljava/nio/ByteBuffer;LS4/h;)Z
    .locals 0

    .line 1
    iget-object p2, p0, Lb5/i;->a:Lb5/r;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Lb5/r;->q(Ljava/nio/ByteBuffer;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
