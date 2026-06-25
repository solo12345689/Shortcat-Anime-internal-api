.class public final enum Lqf/N0;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final enum e:Lqf/N0;

.field public static final enum f:Lqf/N0;

.field public static final enum g:Lqf/N0;

.field private static final synthetic h:[Lqf/N0;

.field private static final synthetic i:Lkotlin/enums/EnumEntries;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Z

.field private final c:Z

.field private final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lqf/N0;

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    const/4 v6, 0x0

    .line 5
    const-string v1, "INVARIANT"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const-string v3, ""

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    invoke-direct/range {v0 .. v6}, Lqf/N0;-><init>(Ljava/lang/String;ILjava/lang/String;ZZI)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lqf/N0;->e:Lqf/N0;

    .line 15
    .line 16
    new-instance v1, Lqf/N0;

    .line 17
    .line 18
    const/4 v7, -0x1

    .line 19
    const-string v2, "IN_VARIANCE"

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    const-string v4, "in"

    .line 23
    .line 24
    invoke-direct/range {v1 .. v7}, Lqf/N0;-><init>(Ljava/lang/String;ILjava/lang/String;ZZI)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lqf/N0;->f:Lqf/N0;

    .line 28
    .line 29
    new-instance v2, Lqf/N0;

    .line 30
    .line 31
    const/4 v7, 0x1

    .line 32
    const/4 v8, 0x1

    .line 33
    const-string v3, "OUT_VARIANCE"

    .line 34
    .line 35
    const/4 v4, 0x2

    .line 36
    const-string v5, "out"

    .line 37
    .line 38
    invoke-direct/range {v2 .. v8}, Lqf/N0;-><init>(Ljava/lang/String;ILjava/lang/String;ZZI)V

    .line 39
    .line 40
    .line 41
    sput-object v2, Lqf/N0;->g:Lqf/N0;

    .line 42
    .line 43
    invoke-static {}, Lqf/N0;->a()[Lqf/N0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lqf/N0;->h:[Lqf/N0;

    .line 48
    .line 49
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lqf/N0;->i:Lkotlin/enums/EnumEntries;

    .line 54
    .line 55
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;ZZI)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lqf/N0;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p4, p0, Lqf/N0;->b:Z

    .line 7
    .line 8
    iput-boolean p5, p0, Lqf/N0;->c:Z

    .line 9
    .line 10
    iput p6, p0, Lqf/N0;->d:I

    .line 11
    .line 12
    return-void
.end method

.method private static final synthetic a()[Lqf/N0;
    .locals 3

    .line 1
    sget-object v0, Lqf/N0;->e:Lqf/N0;

    .line 2
    .line 3
    sget-object v1, Lqf/N0;->f:Lqf/N0;

    .line 4
    .line 5
    sget-object v2, Lqf/N0;->g:Lqf/N0;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lqf/N0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lqf/N0;
    .locals 1

    .line 1
    const-class v0, Lqf/N0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lqf/N0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lqf/N0;
    .locals 1

    .line 1
    sget-object v0, Lqf/N0;->h:[Lqf/N0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lqf/N0;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqf/N0;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/N0;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/N0;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
