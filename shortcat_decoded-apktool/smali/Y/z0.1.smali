.class public interface abstract LY/z0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/c0;
.implements LY/C0;


# virtual methods
.method public abstract c()F
.end method

.method public getValue()Ljava/lang/Float;
    .locals 1

    .line 2
    invoke-interface {p0}, LY/z0;->c()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p0}, LY/z0;->getValue()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public j(F)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, LY/z0;->k(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public abstract k(F)V
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-interface {p0, p1}, LY/z0;->j(F)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
