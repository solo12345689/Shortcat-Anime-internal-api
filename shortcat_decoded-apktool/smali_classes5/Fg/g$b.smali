.class public final LFg/g$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFg/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final c:LFg/g$b;

.field public static final d:LFg/g$b;

.field public static final e:LFg/g$b;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LFg/g$b;

    .line 2
    .line 3
    const-string v1, "ecImplicitlyCA"

    .line 4
    .line 5
    const-class v2, LEg/a;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, LFg/g$b;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, LFg/g$b;->c:LFg/g$b;

    .line 11
    .line 12
    new-instance v0, LFg/g$b;

    .line 13
    .line 14
    const-string v1, "dhDefaultParams"

    .line 15
    .line 16
    const-class v2, LKg/b;

    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, LFg/g$b;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, LFg/g$b;->d:LFg/g$b;

    .line 22
    .line 23
    new-instance v0, LFg/g$b;

    .line 24
    .line 25
    const-string v1, "dsaDefaultParams"

    .line 26
    .line 27
    const-class v2, LKg/d;

    .line 28
    .line 29
    invoke-direct {v0, v1, v2}, LFg/g$b;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, LFg/g$b;->e:LFg/g$b;

    .line 33
    .line 34
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LFg/g$b;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, LFg/g$b;->b:Ljava/lang/Class;

    .line 7
    .line 8
    return-void
.end method

.method static synthetic a(LFg/g$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, LFg/g$b;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic b(LFg/g$b;)Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, LFg/g$b;->b:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method
