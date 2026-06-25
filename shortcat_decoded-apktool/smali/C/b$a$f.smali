.class public final LC/b$a$f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LC/b$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC/b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b(Li1/d;I[ILi1/t;[I)V
    .locals 0

    .line 1
    sget-object p1, LC/b;->a:LC/b;

    .line 2
    .line 3
    const/4 p4, 0x0

    .line 4
    invoke-virtual {p1, p2, p3, p5, p4}, LC/b;->n(I[I[IZ)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "AbsoluteArrangement#SpaceEvenly"

    .line 2
    .line 3
    return-object v0
.end method
