.class final LF/o$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Ljava/lang/Object;

.field private c:I

.field private d:Lkotlin/jvm/functions/Function2;

.field final synthetic e:LF/o;


# direct methods
.method public constructor <init>(LF/o;ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/o$a;->e:LF/o;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p3, p0, LF/o$a;->a:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p4, p0, LF/o$a;->b:Ljava/lang/Object;

    .line 9
    .line 10
    iput p2, p0, LF/o$a;->c:I

    .line 11
    .line 12
    return-void
.end method

.method public static final synthetic a(LF/o$a;I)V
    .locals 0

    .line 1
    iput p1, p0, LF/o$a;->c:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic b(LF/o$a;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/o$a;->d:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    return-void
.end method

.method private final c()Lkotlin/jvm/functions/Function2;
    .locals 3

    .line 1
    new-instance v0, LF/o$a$a;

    .line 2
    .line 3
    iget-object v1, p0, LF/o$a;->e:LF/o;

    .line 4
    .line 5
    invoke-direct {v0, v1, p0}, LF/o$a$a;-><init>(LF/o;LF/o$a;)V

    .line 6
    .line 7
    .line 8
    const v1, 0x53af4291

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-static {v1, v2, v0}, Lg0/i;->b(IZLjava/lang/Object;)Lg0/b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method


# virtual methods
.method public final d()Lkotlin/jvm/functions/Function2;
    .locals 1

    .line 1
    iget-object v0, p0, LF/o$a;->d:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, LF/o$a;->c()Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LF/o$a;->d:Lkotlin/jvm/functions/Function2;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LF/o$a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, LF/o$a;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LF/o$a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
