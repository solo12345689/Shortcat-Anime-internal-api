.class public interface abstract LI0/p;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static synthetic V(LI0/p;LI0/p;ZILjava/lang/Object;)Lr0/h;
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x1

    .line 8
    :cond_0
    invoke-interface {p0, p1, p2}, LI0/p;->w0(LI0/p;Z)Lr0/h;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: localBoundingBoxOf"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method


# virtual methods
.method public abstract B(J)J
.end method

.method public abstract E0(J)J
.end method

.method public abstract U(J)J
.end method

.method public abstract a()J
.end method

.method public abstract b()Z
.end method

.method public abstract c0(J)J
.end method

.method public abstract h0(LI0/p;JZ)J
.end method

.method public abstract j0([F)V
.end method

.method public abstract o0(LI0/p;[F)V
.end method

.method public abstract q(J)J
.end method

.method public abstract w0(LI0/p;Z)Lr0/h;
.end method

.method public abstract x0()LI0/p;
.end method

.method public abstract y0(LI0/p;J)J
.end method
