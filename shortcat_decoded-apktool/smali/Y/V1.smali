.class abstract synthetic LY/V1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lg0/r;

.field private static final b:Lg0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lg0/r;

    .line 2
    .line 3
    invoke-direct {v0}, Lg0/r;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LY/V1;->a:Lg0/r;

    .line 7
    .line 8
    new-instance v0, Lg0/r;

    .line 9
    .line 10
    invoke-direct {v0}, Lg0/r;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LY/V1;->b:Lg0/r;

    .line 14
    .line 15
    return-void
.end method

.method public static final synthetic a()Lg0/r;
    .locals 1

    .line 1
    sget-object v0, LY/V1;->a:Lg0/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final b()La0/c;
    .locals 4

    .line 1
    sget-object v0, LY/V1;->b:Lg0/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/r;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La0/c;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, La0/c;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    new-array v3, v2, [LY/V;

    .line 15
    .line 16
    invoke-direct {v1, v3, v2}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lg0/r;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object v1
.end method

.method public static final c(LY/T1;Lie/a;)LY/h2;
    .locals 1

    .line 1
    new-instance v0, LY/T;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, LY/T;-><init>(Lie/a;LY/T1;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final d(Lie/a;)LY/h2;
    .locals 2

    .line 1
    new-instance v0, LY/T;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LY/T;-><init>(Lie/a;LY/T1;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
