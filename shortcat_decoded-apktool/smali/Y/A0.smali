.class public interface abstract LY/A0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/j0;
.implements LY/C0;


# virtual methods
.method public abstract b()I
.end method

.method public abstract f(I)V
.end method

.method public getValue()Ljava/lang/Integer;
    .locals 1

    .line 2
    invoke-interface {p0}, LY/A0;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p0}, LY/A0;->getValue()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public h(I)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, LY/A0;->f(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-interface {p0, p1}, LY/A0;->h(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
