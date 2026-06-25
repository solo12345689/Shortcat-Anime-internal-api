.class final enum Lk5/h$a;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field public static final enum a:Lk5/h$a;

.field public static final enum b:Lk5/h$a;

.field public static final enum c:Lk5/h$a;

.field public static final enum d:Lk5/h$a;

.field public static final enum e:Lk5/h$a;

.field public static final enum f:Lk5/h$a;

.field private static final synthetic g:[Lk5/h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lk5/h$a;

    .line 2
    .line 3
    const-string v1, "PENDING"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lk5/h$a;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lk5/h$a;->a:Lk5/h$a;

    .line 10
    .line 11
    new-instance v0, Lk5/h$a;

    .line 12
    .line 13
    const-string v1, "RUNNING"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lk5/h$a;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lk5/h$a;->b:Lk5/h$a;

    .line 20
    .line 21
    new-instance v0, Lk5/h$a;

    .line 22
    .line 23
    const-string v1, "WAITING_FOR_SIZE"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lk5/h$a;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lk5/h$a;->c:Lk5/h$a;

    .line 30
    .line 31
    new-instance v0, Lk5/h$a;

    .line 32
    .line 33
    const-string v1, "COMPLETE"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lk5/h$a;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lk5/h$a;->d:Lk5/h$a;

    .line 40
    .line 41
    new-instance v0, Lk5/h$a;

    .line 42
    .line 43
    const-string v1, "FAILED"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, Lk5/h$a;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lk5/h$a;->e:Lk5/h$a;

    .line 50
    .line 51
    new-instance v0, Lk5/h$a;

    .line 52
    .line 53
    const-string v1, "CLEARED"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2}, Lk5/h$a;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lk5/h$a;->f:Lk5/h$a;

    .line 60
    .line 61
    invoke-static {}, Lk5/h$a;->a()[Lk5/h$a;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lk5/h$a;->g:[Lk5/h$a;

    .line 66
    .line 67
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic a()[Lk5/h$a;
    .locals 6

    .line 1
    sget-object v0, Lk5/h$a;->a:Lk5/h$a;

    .line 2
    .line 3
    sget-object v1, Lk5/h$a;->b:Lk5/h$a;

    .line 4
    .line 5
    sget-object v2, Lk5/h$a;->c:Lk5/h$a;

    .line 6
    .line 7
    sget-object v3, Lk5/h$a;->d:Lk5/h$a;

    .line 8
    .line 9
    sget-object v4, Lk5/h$a;->e:Lk5/h$a;

    .line 10
    .line 11
    sget-object v5, Lk5/h$a;->f:Lk5/h$a;

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Lk5/h$a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lk5/h$a;
    .locals 1

    .line 1
    const-class v0, Lk5/h$a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lk5/h$a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lk5/h$a;
    .locals 1

    .line 1
    sget-object v0, Lk5/h$a;->g:[Lk5/h$a;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lk5/h$a;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lk5/h$a;

    .line 8
    .line 9
    return-object v0
.end method
