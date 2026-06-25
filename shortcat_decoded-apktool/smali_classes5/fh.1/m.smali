.class abstract Lfh/m;
.super Ljava/lang/Object;


# direct methods
.method public static a(I)[I
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    add-int/lit16 v1, p0, 0xfff

    .line 5
    .line 6
    shr-int/lit8 v1, v1, 0xd

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    aput v1, v0, v2

    .line 10
    .line 11
    shl-int/lit8 v1, v1, 0xd

    .line 12
    .line 13
    sub-int/2addr p0, v1

    .line 14
    const/4 v1, 0x1

    .line 15
    aput p0, v0, v1

    .line 16
    .line 17
    return-object v0
.end method
