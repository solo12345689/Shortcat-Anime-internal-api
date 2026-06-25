.class public final Lcom/google/android/gms/internal/measurement/j2;
.super Lcom/google/android/gms/internal/measurement/b5;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/F5;


# direct methods
.method synthetic constructor <init>([B)V
    .locals 0

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k2;->X()Lcom/google/android/gms/internal/measurement/k2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/b5;-><init>(Lcom/google/android/gms/internal/measurement/d5;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final A()Lcom/google/android/gms/internal/measurement/j2;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/b5;->k()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/b5;->b:Lcom/google/android/gms/internal/measurement/d5;

    .line 5
    .line 6
    check-cast v0, Lcom/google/android/gms/internal/measurement/k2;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k2;->W()V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final B()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/b5;->b:Lcom/google/android/gms/internal/measurement/d5;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/measurement/k2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k2;->M()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final C()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/b5;->b:Lcom/google/android/gms/internal/measurement/d5;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/measurement/k2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k2;->N()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final t()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/b5;->b:Lcom/google/android/gms/internal/measurement/d5;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/measurement/k2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k2;->H()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final u(I)Lcom/google/android/gms/internal/measurement/i2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/b5;->b:Lcom/google/android/gms/internal/measurement/d5;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/measurement/k2;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/k2;->I(I)Lcom/google/android/gms/internal/measurement/i2;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final v(ILcom/google/android/gms/internal/measurement/h2;)Lcom/google/android/gms/internal/measurement/j2;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/b5;->k()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/b5;->b:Lcom/google/android/gms/internal/measurement/d5;

    .line 5
    .line 6
    check-cast v0, Lcom/google/android/gms/internal/measurement/k2;

    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/b5;->q()Lcom/google/android/gms/internal/measurement/d5;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    check-cast p2, Lcom/google/android/gms/internal/measurement/i2;

    .line 13
    .line 14
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/k2;->U(ILcom/google/android/gms/internal/measurement/i2;)V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public final x()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/b5;->b:Lcom/google/android/gms/internal/measurement/d5;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/measurement/k2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k2;->J()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final y()Lcom/google/android/gms/internal/measurement/j2;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/b5;->k()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/b5;->b:Lcom/google/android/gms/internal/measurement/d5;

    .line 5
    .line 6
    check-cast v0, Lcom/google/android/gms/internal/measurement/k2;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k2;->V()V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
