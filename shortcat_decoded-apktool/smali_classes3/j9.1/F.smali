.class public final enum Lj9/F;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final enum b:Lj9/F;

.field public static final enum c:Lj9/F;

.field public static final enum d:Lj9/F;

.field public static final enum e:Lj9/F;

.field private static final synthetic f:[Lj9/F;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lj9/F;

    .line 2
    .line 3
    const-string v1, "UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lj9/F;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lj9/F;->b:Lj9/F;

    .line 10
    .line 11
    new-instance v1, Lj9/F;

    .line 12
    .line 13
    const-string v2, "SUCCESS"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3}, Lj9/F;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lj9/F;->c:Lj9/F;

    .line 20
    .line 21
    new-instance v2, Lj9/F;

    .line 22
    .line 23
    const-string v3, "FAILURE"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4, v4}, Lj9/F;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lj9/F;->d:Lj9/F;

    .line 30
    .line 31
    new-instance v3, Lj9/F;

    .line 32
    .line 33
    const-string v4, "BACKOFF"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5, v5}, Lj9/F;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lj9/F;->e:Lj9/F;

    .line 40
    .line 41
    filled-new-array {v0, v1, v2, v3}, [Lj9/F;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lj9/F;->f:[Lj9/F;

    .line 46
    .line 47
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lj9/F;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static values()[Lj9/F;
    .locals 1

    .line 1
    sget-object v0, Lj9/F;->f:[Lj9/F;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lj9/F;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lj9/F;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    .line 1
    iget v0, p0, Lj9/F;->a:I

    .line 2
    .line 3
    return v0
.end method
